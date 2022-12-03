package com.example.numberguessinggame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class GuessingController {
    GameLogic logic = new GameLogic();
    @FXML
    private TextField tf;

    @FXML
    private VBox vb;

    @FXML
    private void setVBox(){
        vb.setStyle("-fx-background-color: black");
    }


    @FXML
    protected void onClick() {
        vb.setStyle("-fx-background-color: black");
        String numStr = tf.getText();
        int num = Integer.parseInt(numStr);
        logic.win(num);

    }

    @FXML
    protected void onRestart(){
        logic.setRandomNumber(10);
    }

    @FXML
    protected void onChangeBounds10(){
        logic.setRandomNumber(11);
    }
    @FXML
    protected void onChangeBounds20(){
        logic.setRandomNumber(21);
    }
    @FXML
    protected void onChangeBounds50(){
        logic.setRandomNumber(51);
    }
    @FXML
    protected void onChangeBounds100(){
        logic.setRandomNumber(101);
    }
}