package com.group5.calculatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PhysicsMVelocityController {
    PhysicsEquations physicsEquations = new PhysicsEquations();


    public Label answerInExplanation;

    public Button scientificButton;


    public Label answerLabel;

    public Button basicButton;
    public Button chemistryButton;
    public Button physicsButton;
    public Button sMomentum;
    public TextField momentum;
    public Label momentumExplanation;
    public Label momentumExpl2;
    public Button sMass;
    public TextField mass;
    public Label massExplanation;
    public Label massExpl2;
    double mass1;
    double momentum1;

    public void clickedEntered(ActionEvent actionEvent) {
        try {
            String massText = mass.getText();
            mass1 = Double.parseDouble(massText);

            String momentumText = momentum.getText();
            momentum1 = Double.parseDouble(momentumText);

            double answer = physicsEquations.solveMomentumVelo(momentum1,mass1);
            answerLabel.setText(Double.toString(answer));


            //Sets the explanation box
            massExplanation.setText(massText);
            momentumExplanation.setText(momentumText);

            momentumExpl2.setText(momentumText);
            massExpl2.setText(massText);

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

    public void clickedMass(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsMMass.fxml"));
            Stage stage = (Stage) sMass.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
