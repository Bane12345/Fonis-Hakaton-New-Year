package controllers;

import javafx.event.ActionEvent;
import services.StageService;

public class ChooseController {

    public void changeScene(ActionEvent event){
        StageService stageService = new StageService();
        stageService.changeScene("resources/view/loginScene.fxml", event);

    }
}
