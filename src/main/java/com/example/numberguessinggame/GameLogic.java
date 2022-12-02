package com.example.numberguessinggame;

import javafx.scene.control.Label;
import javafx.stage.Popup;

import java.util.Random;

public class GameLogic {

    int randomNumber;

    public void setRandomNumber() {
        Random random = new Random();
        randomNumber = random.nextInt(10);
        System.out.println(randomNumber);
    }
     public boolean isNum(int guess){
        boolean checkNum = (guess == randomNumber)? true:false;
        return checkNum;
     }

     public void win(int guess){
        if(isNum(guess)){
            Popup popup = new Popup();
            Label label = new Label("You've guessed it right!");
            label.setStyle("-fx-background-color: pink;");
            popup.getContent().add(label);
            label.setMinWidth(80);
            label.setMinHeight(50);
            i
        }
     }

    public GameLogic() {
        setRandomNumber();
    }
}
