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
        if (question_txt.getText().equals("") || !question_txt.getText().endsWith("?")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("No question");
            //alert.setHeaderText("Wrong Username or Password");
            alert.setHeaderText("Enter a valid question");
            alert.setContentText("Valid question:  question?");
            alert.showAndWait();
        } else if(question_txt.getText().contains("SEW")){
            answer_lbl.setText(model.getPositiveAnswers(question_txt.getText()));
        }
        else {
            answer_lbl.setText(model.getRandomAnswers(question_txt.getText()));
        }
    }

    @FXML
    public void initialize() {
        model = new Model();
    }
}

