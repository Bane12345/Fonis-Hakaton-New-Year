package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PlayController implements Initializable {

    @FXML Label guesedLetters;
    @FXML TextField letter;
    @FXML TextField word;
    @FXML
    ImageView firstImage;
    @FXML ImageView secongImage;
    @FXML ImageView thirdImage;
    @FXML ImageView fourthImage;
    @FXML ImageView fifthImage;
    @FXML ImageView sixthImage;
    @FXML ImageView seventhImage;

    List<ImageView> images = new ArrayList<>(7);

    String choice;
    int steps;
    int mistakesMade = 0;
    String pictureName;

    public void setChoice(String choice){
        this.choice = choice;
    }

    public void setSteps(){
        switch (choice){
            case "Santa Clause":
                pictureName = "dedamraz";
                steps = 6;
                break;
            case "Elf":
                steps = 7;
                pictureName = "elf";
                break;
            case "Reindeer":
                steps = 5;
                pictureName = "irvas";
                break;
            case "Snowman":
                steps = 4;
                pictureName = "snesko";
                break;
        }
    }

    private void mistake(){
        ImageView imageView = images.get(mistakesMade-1);
        int pistureNumber = steps - mistakesMade + 1;
        String path = ""+steps;
        Image image = new Image(getClass().getResourceAsStream(path));
        imageView.setImage(image);
        imageView.setVisible(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.images.add(firstImage);
        this.images.add(secongImage);
        this.images.add(thirdImage);
        this.images.add(fourthImage);
        this.images.add(fifthImage);
        this.images.add(sixthImage);
        this.images.add(seventhImage);
    }
}
