package model;

import login.Login;
import main.Main;

import java.util.ArrayList;

public class Model {
    private Main main;
    private ArrayList<Login> loginlist;

    public Model(Main main) {
        this.main = main;
    }

    public Model() {

    }

    public void addLogin(String username, String password) {
        this.loginlist = new ArrayList<>();
        this.loginlist.add(new Login(username, password));
    }

    public ArrayList<Login> getLoginlist() {
        return loginlist;
    }

    public void setLoginlist(ArrayList<Login> loginlist) {
        this.loginlist = loginlist;
    }

    public static final String[] answers = {
            "It is certain",
            "It is decidedly so",
            "Without a doubt",
            "Yes - definitely",
            "You may rely on it",
            "As I see it, yes",
            "Most likely",
            "Outlook good",
            "Yes",
            "Signs point to yes",
            "Reply hazy, try again",
            "Ask again later",
            "Better not tell you now",
            "Cannot predict now",
            "Concentrate and ask again",
            "Don't count on it",
            "My reply is no",
            "My sources say no",
            "Outlook not so good",
            "Very doubtful"
    };

    public static final String[] positiveAnswers = {
            "It is certain",
            "It is decidedly so",
            "Without a doubt",
            "Yes - definitely",
            "You may rely on it",
            "As I see it, yes",
            "Most likely",
            "Outlook good",
            "Yes",
    };


    public String getRandomAnswers(String question){
        return answers[(int) (Math.random() * answers.length-1)] ;
    }

    public String getPositiveAnswers(String question){
        return positiveAnswers[(int) (Math.random() * positiveAnswers.length-1)];
    }

    public boolean isCorrectLogin(Login login) {
        for (Login tmp : loginlist) {
            if (tmp.getName().equals(login.getName()) && tmp.getPassword().equals(login.getPassword())) {
                return true;
            }
        }
        return false;
    }
}



