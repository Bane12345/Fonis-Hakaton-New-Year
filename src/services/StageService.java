package services;

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
}
