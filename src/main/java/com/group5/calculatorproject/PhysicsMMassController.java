package com.group5.calculatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PhysicsMMassController {
    PhysicsEquations physicsEquations = new PhysicsEquations();

    public Label velocityExpl2;
    public Label answerInExplanation;
    public Label velocityExplanation;
    public Button scientificButton;
    public Button sVelocity;

    public Label answerLabel;
    public TextField velocity;

    public Button basicButton;
    public Button chemistryButton;
    public Button physicsButton;
    public Button sMomentum;
    public TextField momentum;
    public Label momentumExplanation;
    public Label momentumExpl2;
    double velocity1;
    double momentum1;

    public void clickedEntered(ActionEvent actionEvent) {
        try {
            String velocityText = velocity.getText();
            velocity1 = Double.parseDouble(velocityText);

            String momentumText = momentum.getText();
            momentum1 = Double.parseDouble(momentumText);

            double answer =  physicsEquations.solveMomentumMass(momentum1,velocity1);

            answerLabel.setText(Double.toString(answer));


            //Sets the explanation box
            velocityExplanation.setText(velocityText);
            momentumExplanation.setText(momentumText);

            momentumExpl2.setText(momentumText);
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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsMVelocity.fxml"));
            Stage stage = (Stage) sVelocity.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
    public void clickedMomentum(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsMomentum.fxml"));
            Stage stage = (Stage) sMomentum.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
