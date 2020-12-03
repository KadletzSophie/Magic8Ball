package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Model;

public class MainController {
    private Model model;

    @FXML
    private Label answer_lbl;

    @FXML
    private TextField question_txt;

    @FXML
    private Button ask_bt;

    @FXML
    void ask(ActionEvent event){

    }

    @FXML
    public void initialize() {
        model = new Model();
    }
}

