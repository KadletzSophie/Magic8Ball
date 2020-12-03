package controller;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import main.Main;
import model.Model;

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
    void sendLogin(ActionEvent event) {


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

