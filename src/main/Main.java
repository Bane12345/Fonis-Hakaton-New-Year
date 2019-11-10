package main;

import com.sun.xml.internal.bind.v2.model.core.ID;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    private TextField letter;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("resources/view/chooseScene.fxml"));
        primaryStage.setTitle("New Year Hangers");
        Scene scene = new Scene(root, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
