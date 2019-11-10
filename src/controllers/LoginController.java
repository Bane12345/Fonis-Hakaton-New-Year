package controllers;

import javafx.event.ActionEvent;
import services.StageService;

public class LoginController {

    public void changeScene2(ActionEvent event){
        StageService stageService = new StageService();
        stageService.changeScene("resources/view/loginScene.fxml", event);

    }
}
