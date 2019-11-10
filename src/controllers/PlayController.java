package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PlayController {
    @FXML
    Label guesedLetters;
    @FXML
    Label letter;
    @FXML TextField word;

    String choice;

    public void setChoice(String choice){
        this.choice = choice;
    }

}
