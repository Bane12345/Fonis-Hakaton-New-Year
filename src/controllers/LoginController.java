package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import services.StageService;
import javafx.scene.control.TextField;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginController {
      @FXML TextField username;
      @FXML PasswordField password;

      private boolean ulogovan=false;
      private boolean registrovan=false;

//    public void changeScene2(ActionEvent event){
//        StageService stageService = new StageService();
//
//        String korisnickoIme = username.getText();
//        String sifra = password.getText();
//        if(registracija(korisnickoIme,sifra)){
//            stageService.changeScene("resources/view/playScene.fxml", event);
//        }else{
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("ERROR");
//            alert.setHeaderText("Username already exists");
//            alert.showAndWait();
//            System.out.println("Greska");
//        }
//    }

    public void changeScene2(ActionEvent event){
        if(this.ulogovan==true||this.registrovan==true) {
            StageService stageService = new StageService();

            String korisnickoIme = username.getText();
            String sifra = password.getText();

            stageService.changeScene("resources/view/playScene.fxml", event);
            }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("You have to log in!");
            alert.showAndWait();
            System.out.println("Greska");

        }
    }


    public void uloguj(ActionEvent e){
        System.out.println(password.getText());
        this.ulogovan=logIn(username.getText(),password.getText());
    }
    public void registruj(ActionEvent e){
        this.registrovan=registracija(username.getText(),password.getText());
    }
    public boolean registracija(String username, String password){

        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\student1\\IdeaProjects\\NovaGodinaProject\\src\\resources\\registracija.txt"));
            String line = reader.readLine();
            while (line != null){
                if(username.equals(line)){
                    return false;
                }
                line=reader.readLine();
                if(line != null) {
                    line = reader.readLine();
                }
            }
            reader.close();
            upisi(username, password);
            this.registrovan=true;
            return true;
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            this.registrovan=false;
            return false;
        }
    }

    public void upisi(String username, String password){
        PrintWriter writter;
        try {
            writter = new PrintWriter(new FileWriter("C:\\Users\\student1\\IdeaProjects\\NovaGodinaProject\\src\\resources\\registracija.txt", true));
            writter.println(username);
            writter.println(password);
            writter.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public boolean logIn(String username, String password){

        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\student1\\IdeaProjects\\NovaGodinaProject\\src\\resources\\registracija.txt"));
            String line = reader.readLine();
            while (line != null){
                if(username.equals(line.trim())){
                    line = reader.readLine();
                    if(password.equals(line.trim())){
                        System.out.println("registrovan");
                        return true;
                    }
                }

                line = reader.readLine();
            }
            reader.close();
            return false;
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }




}
