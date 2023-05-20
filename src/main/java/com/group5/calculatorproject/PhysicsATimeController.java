package com.group5.calculatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PhysicsATimeController {
    PhysicsEquations physicsEquations = new PhysicsEquations();

    public Label velocityExpl2;
    public Label answerInExplanation;
    public Label velocityExplanation;
    public Button scientificButton;
    public Button sVelocity;
    public TextField time;
    public Label answerLabel;
    public TextField velocity;
    public Button basicButton;
    public Button chemistryButton;
    public Button physicsButton;
    public Label accelerationExplanation;
    public Button sAcceleration;
    public Label accelerationExpl2;
    double velocity1;
    double acceleration1;

    public void clickedEntered(ActionEvent actionEvent) {
        try {
            String velocityText = velocity.getText();
            velocity1 = Double.parseDouble(velocityText);

            String accelerationText = time.getText();
            acceleration1 = Double.parseDouble(accelerationText);

            double answer = physicsEquations.solveAccelerationTime(velocity1,acceleration1);
            answerLabel.setText(Double.toString(answer));

            //Sets the explanation box
            velocityExplanation.setText(velocityText);
            accelerationExplanation.setText(accelerationText);

            accelerationExpl2.setText(accelerationText);
            velocityExpl2.setText(velocityText);

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
    public void clickedVelocity(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsAVelocity.fxml"));
            Stage stage = (Stage) sVelocity.getScene().getWindow();
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
