package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PlayController {
    @FXML
    Label guesedLetters;
    @FXML
    TextField letter;
    @FXML TextField word;


    public void setGuesedLetters(){
        this.guesedLetters.setText();
    }
}
