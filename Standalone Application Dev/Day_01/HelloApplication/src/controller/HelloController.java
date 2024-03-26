package controller;

import javafx.event.ActionEvent;
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
    public Label lblId;
    public TextField userNameId;
    public PasswordField passwordId;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        String userName = userNameId.getText();
        String password = passwordId.getText();
        lblId.setText("Hello!"+userName+" "+password);

        User user = new User(userName,password);

        System.out.println(user);

        new Alert(Alert.AlertType.INFORMATION,"Login Success").show();

        Parent parent = new FXMLLoader(getClass().getResource("../view/DashBoardForm.fxml")).load();
        Stage stage = new Stage();
        stage.setScene(new Scene(parent));
        stage.show();
    }
}
