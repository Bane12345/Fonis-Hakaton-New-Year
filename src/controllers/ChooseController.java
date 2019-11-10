package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import services.StageService;

public class ChooseController {

    @FXML
    Button santa;
    @FXML Button elf;
    @FXML Button reindeer;
    @FXML Button snowman;


    public void changeScene(ActionEvent event){
        StageService stageService = new StageService();
        stageService.changeScene("resources/view/loginScene.fxml", event);
    }

    public void levelChosen(ActionEvent event){
        String level = ((Button) event.getSource()).getText();
        StageService service = new StageService();
        service.changeSceneAndPassChoice("resources/view/playScene.fxml", event, level);
    }

}
