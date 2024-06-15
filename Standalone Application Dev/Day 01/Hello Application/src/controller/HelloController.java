package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.User;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label lblPassword;

    @FXML
    private Label lblUserName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    public void btnClickMeOnAction(ActionEvent actionEvent) throws IOException {

        String userName = txtUserName.getText();
        String password = txtPassword.getText();


        lblUserName.setText(txtUserName.getText());
        lblPassword.setText(txtPassword.getText());

        User user = new User(userName,password);

        System.out.println(user);

        new Alert(Alert.AlertType.INFORMATION,"Login Success").show();

        Parent load = new FXMLLoader(getClass().getResource("../view/dashboardFrom.fxml")).load();
        Stage stage = new Stage();
        stage.setScene(new Scene(load));
        stage.show();

    }
}
