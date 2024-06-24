package edu.icet.demo.controller.order;

import edu.icet.demo.controller.customer.CustomerController;
import edu.icet.demo.controller.item.ItemController;
import edu.icet.demo.db.DBConnection;
import edu.icet.demo.dto.Customer;
import edu.icet.demo.dto.Item;
import edu.icet.demo.dto.Order;
import edu.icet.demo.dto.OrderDetail;
import edu.icet.demo.dto.tableModel.CartTable;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Duration;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlaceOrderFromController implements Initializable {
    @FXML
    private ComboBox<String> cmbCustomerId;

    @FXML
    private ComboBox<String> cmdItemId;

    @FXML
    private Label lblAddress;

    @FXML
    private Label lblCity;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblDesc;

    @FXML
    private Label lblName;

    @FXML
    private Label lblQtyOnHand;

    @FXML
    private Label lblSalary;

    @FXML
    private Label lblTime;

    @FXML
    private Label lblUnitPrice;

    @FXML
    private Label lblpackSize;

    @FXML
    private Label lblOrderId;

    @FXML
    private Label lblNetTotal;

    @FXML
    private TextField txtQty;

    @FXML
    private TableColumn<?, ?> colDescription;

    @FXML
    private TableColumn<?, ?> colItemCode;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colTotal;

    @FXML
    private TableColumn<?, ?> colUnitPrice;

    @FXML
    private TableView<CartTable> tblCart;


    ObservableList<Customer> allCustomers;
    ObservableList<Item> allItems;
    ObservableList<CartTable> cartList = FXCollections.observableArrayList();
    Double netTotal = 0.0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadDateAndTime();
        loadCustomerIds();
        loadItems();
        generateOrderId();
        cmbCustomerId.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> searchCustomerOnAction(newValue));
        cmdItemId.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> searchItemOnAction(newValue));
    }


    @FXML
    void btnAddToCartOnAction(ActionEvent event) {

        String itemCode = cmdItemId.getValue().toString();
        String description = lblDesc.getText();
        Integer qty = Integer.parseInt(txtQty.getText());
        Double unitPrice = Double.parseDouble(lblUnitPrice.getText());
        Double total = qty * unitPrice;
        netTotal += total;
        lblNetTotal.setText(String.valueOf(netTotal));

        CartTable cartTable = new CartTable(itemCode, description, qty, unitPrice, total, 0.0);
        cartList.add(cartTable);
        tblCart.setItems(cartList);
        colItemCode.setCellValueFactory(new PropertyValueFactory<>("itemCode"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        colQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        colUnitPrice.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        colTotal.setCellValueFactory(new PropertyValueFactory<>("total"));
    }

    @FXML
    void btnClearCartOnAction(ActionEvent event) {

    }


    @FXML
    void btnPlaceOrderOnAction(ActionEvent event) {
        try {
            String orderId = lblOrderId.getText();
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date orderDate = format.parse(lblDate.getText());
            String customerId = cmbCustomerId.getValue().toString();
            List<OrderDetail> orderDetailList = new ArrayList<>();
            for (CartTable cartTable : cartList) {
                OrderDetail orderDetail = new OrderDetail(orderId, cartTable.getItemCode(), cartTable.getQty(), cartTable.getDiscount());
                orderDetailList.add(orderDetail);
            }
            Order order = new Order(orderId, orderDate, customerId, orderDetailList);
            //System.out.println(order);
            Boolean isPlaceOrder = OrderController.getInstance().placeOrder(order);
            if(isPlaceOrder) {
                generateOrderId();
                new Alert(Alert.AlertType.INFORMATION, "Order Placed").show();
            }
        } catch (ParseException | SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void txtAddToCarOnAction(ActionEvent event) {
        btnAddToCartOnAction(event);
    }

    private void searchItemOnAction(String itemCode) {
        try {
            ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM item WHERE ItemCode ='" + itemCode + "'");
            while (resultSet.next()) {
                Item item = new Item(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDouble(4),
                        resultSet.getInt(5)
                );
                lblDesc.setText(item.getDescription());
                lblpackSize.setText(item.getPackSize());
                lblUnitPrice.setText(String.valueOf(item.getUnitPrice()));
                lblQtyOnHand.setText(String.valueOf(item.getQtyOnHand()));
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void searchCustomerOnAction(String custId) {
        try {
            ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM customer WHERE CustID ='" + custId + "'");
            while (resultSet.next()) {
                Customer customer = new Customer(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDate(4).toLocalDate(),
                        resultSet.getDouble(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(9)
                );
                lblName.setText(customer.getName());
                lblAddress.setText(customer.getAddress());
                lblSalary.setText(String.valueOf(customer.getSalary()));
                lblCity.setText(customer.getCity());
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    private void loadItems() {
        allItems = ItemController.getInstance().getAllItems();
        ObservableList<String> itemCodes = FXCollections.observableArrayList();
        for (Item item : allItems) {
            itemCodes.add(item.getItemCode());
        }
        cmdItemId.setItems(itemCodes);

    }

    private void loadCustomerIds() {
        allCustomers = CustomerController.getInstance().getAllCustomers();
        ObservableList<String> ids = FXCollections.observableArrayList();
        for (Customer c : allCustomers) {
            ids.add(c.getId());
        }
        cmbCustomerId.setItems(ids);
    }

    private void loadDateAndTime() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        lblDate.setText(format.format(date));

        Timeline timeline = new Timeline(new KeyFrame(Duration.ZERO, actionEvent -> {
            LocalTime time = LocalTime.now();
            lblTime.setText(time.getHour() + " : " + time.getMinute() + " : " + time.getSecond());
        }), new KeyFrame(Duration.seconds(1)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public void generateOrderId() {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM orders");
            Integer count = 0;
            while (resultSet.next()) {
                count = resultSet.getInt(1);

            }
            if (count == 0) {
                lblOrderId.setText("D001");
            }
            String lastOrderId = "";
            ResultSet resultSet1 = connection.createStatement().executeQuery("SELECT OrderID\n" +
                    "FROM orders\n" +
                    "ORDER BY OrderID DESC\n" +
                    "LIMIT 1;");
            if (resultSet1.next()) {
                lastOrderId = resultSet1.getString(1);
                Pattern pattern = Pattern.compile("[A-Za-z](\\d+)");
                Matcher matcher = pattern.matcher(lastOrderId);
                if (matcher.find()) {
                    int number = Integer.parseInt(matcher.group(1));
                    number++;
                    lblOrderId.setText(String.format("D%03d", number));
                } else {
                    new Alert(Alert.AlertType.WARNING, "hello").show();
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
