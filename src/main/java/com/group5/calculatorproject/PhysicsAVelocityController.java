package com.group5.calculatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PhysicsAVelocityController {

    PhysicsEquations physicsEquations = new PhysicsEquations();

    public Label answerInExplanation;
    public Button scientificButton;
    public Button sTime;
    public TextField time;
    public Label answerLabel;
    public Label timeExplanation;
    public Button basicButton;
    public Button chemistryButton;
    public Button physicsButton;
    public Button sAcceleration;
    public TextField acceleration;
    public Label accelerationExplanation;
    public Label time2;
    public Label acceleration2;
    double acceleration1;
    double time1;

    public void clickedEntered(ActionEvent actionEvent) {
        try {
            String accelerationText = acceleration.getText();
            acceleration1 = Double.parseDouble(accelerationText);

            String timeText = time.getText();
            time1 = Double.parseDouble(timeText);

            double answer = physicsEquations.solveDeltaVelo(acceleration1,time1);

            answerLabel.setText(Double.toString(answer));

            //Sets the explanation box
            acceleration.setText(accelerationText);
            timeExplanation.setText(timeText);
            time2.setText(timeText);
            acceleration2.setText(accelerationText);
            answerInExplanation.setText(answerLabel.getText());
        }
        catch (Exception e){
            answerLabel.setText("SYNTAX ERROR: NOT A NUMBER");
        }
    }
    public void clickedScientificButton(ActionEvent actionEvent){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ScientificCal.fxml"));
            Stage stage = (Stage) scientificButton.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
    public void clickedBasic(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BasicView.fxml"));
            Stage stage = (Stage) basicButton.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
    public void clickedChemistry(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ChemistryView.fxml"));
            Stage stage = (Stage) chemistryButton.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedPhysics(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Physics.fxml"));
            Stage stage = (Stage) physicsButton.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedTime(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsATime.fxml"));
            Stage stage = (Stage) sTime.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedAcceleration(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsAcceleration.fxml"));
            Stage stage = (Stage) sAcceleration.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
