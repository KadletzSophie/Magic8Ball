package main;


import controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import controller.LoginController;
import model.Model;

/**
 * @author Sophie Kadletz
 * @version 03.12.2020
 */

public class Main extends Application {

    public static void main(String[] args) {launch(args);}

    private Parent login;
    private Parent main;
    private MainController c;
    private LoginController l;
    private Stage stage;
    private Model model;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.stage = primaryStage;

        model = new Model(this);
        model.addLogin("test", "test"); //Logindaten hinzufügen

        FXMLLoader loginFXML = new FXMLLoader(getClass().getResource("../views/login.fxml"));
        FXMLLoader mainFXML = new FXMLLoader(getClass().getResource("../views/main.fxml"));

        login = loginFXML.load();
        main = mainFXML.load();

        c = mainFXML.getController();
        l = loginFXML.getController();

        l.setModel(model);
        l.setMain(this);

        stage.setTitle("Login");
        stage.setScene(new Scene(login));
        stage.show();
    }

    public void changeScene(){
        stage.setScene(new Scene(main));
        stage.setTitle("Magic 8 Ball");
    }



}
