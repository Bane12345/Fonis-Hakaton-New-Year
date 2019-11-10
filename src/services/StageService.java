package services;

import controllers.PlayController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class StageService {

    public void changeScene(String newScenePath, ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getClassLoader().getResource(newScenePath));
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.getScene().setRoot(parent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeSceneAndPassChoice(String newScenePath, ActionEvent event, String choice) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource(newScenePath));
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.getScene().setRoot(loader.load());
            ((PlayController) loader.getController()).setChoice(choice);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
