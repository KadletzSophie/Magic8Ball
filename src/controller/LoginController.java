package controller;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import login.Login;
import main.Main;
import model.Model;

/**
 * @author Sophie Kadletz
 * @version 03.12.2020
 */

public class LoginController {
    private Model model;
    private Main main;

    @FXML
    private TextField name_txt;

    @FXML
    private PasswordField pwd_txt;

    @FXML
    private Button login_bt;

    @FXML
    private Button cancel_bt;

    @FXML
    void cancelLogin(ActionEvent event) {
        name_txt.clear();
        pwd_txt.clear();
    }

    @FXML
    void sendLogin(ActionEvent event) {
        if (model.isCorrectLogin(new Login(name_txt.getText(), pwd_txt.getText()))){
            main.changeScene();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Wrong Login");
            //alert.setHeaderText("Wrong Username or Password");
            alert.setHeaderText(null);
            alert.setContentText("Wrong Username or Password");
            alert.showAndWait();
        }

    }

    public void setModel(Model model){
        this.model = model;
    }
    public void setMain(Main main){
        this.main = main;
    }

    @FXML
    public void initialize(){
        login_bt.disableProperty().bind(
                Bindings.isEmpty(name_txt.textProperty())
                        .or(Bindings.isEmpty(pwd_txt.textProperty()))
        );
    }
}

