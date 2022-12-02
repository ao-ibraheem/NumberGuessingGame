package com.example.numberguessinggame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GuessingController {
    @FXML
    private TextField tf;

    @FXML
    protected void onClick() {
        String numStr = tf.getText();
        int num = Integer.parseInt(numStr);
        GameLogic logic = new GameLogic();
        logic.win(num);

    }
}