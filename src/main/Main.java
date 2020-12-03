package main;


import controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import controller.LoginController;
import model.Model;

public class Main extends Application {

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
        model.addLogin("test", "test");

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


    public static void main(String[] args) {launch(args);}
}
