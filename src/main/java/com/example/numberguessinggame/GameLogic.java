package com.example.numberguessinggame;

import javafx.scene.control.Label;
import javafx.stage.Popup;

import java.util.Random;

public class GameLogic {

    int randomNumber;
    int bound = 10;

    public void setRandomNumber(int bound) {
        this.bound = bound;
        Random random = new Random();
        randomNumber = random.nextInt(bound);
        System.out.println(randomNumber);
    }
     public boolean isNum(int guess){
        boolean checkNum = (guess == randomNumber)? true:false;
        return checkNum;
     }

     public void win(int guess){
        if(isNum(guess)){
            System.out.println("You win");
            System.out.println("Game will reset");
            setRandomNumber(bound);
            Popup popup = new Popup();
            Label label = new Label("You've guessed it right!");
            label.setStyle("-fx-background-color: pink;");
            popup.getContent().add(label);
            label.setMinWidth(80);
            label.setMinHeight(50);
        }
        else{
            System.out.println("Wrong answer try again");
        }
     }

    public GameLogic() {
        setRandomNumber(bound);
    }
}
