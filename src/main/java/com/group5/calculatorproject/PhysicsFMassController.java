package com.group5.calculatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PhysicsFMassController {
    PhysicsEquations physicsEquations = new PhysicsEquations();



    public Label answerInExplanation;

    public Button scientificButton;
    public Label answerLabel;

    public Button basicButton;
    public Button chemistryButton;
    public Button physicsButton;
    public Button sAcceleration;
    public Button sForce;
    public TextField acceleration;
    public TextField force;
    public Label forceExplanation;
    public Label accelerationExplanation;
    public Label accelerationExpl2;
    public Label forceExpl2;
    double acceleration1;
    double force1;

    public void clickedEntered(ActionEvent actionEvent) {
        try {
            String accelerationText = acceleration.getText();
            acceleration1 = Double.parseDouble(accelerationText);

            String forceText = force.getText();
            force1 = Double.parseDouble(forceText);

            double answer = physicsEquations.solveForceMass(force1,acceleration1);

            answerLabel.setText(Double.toString(answer));
            //Sets the explanation box
            forceExplanation.setText(forceText);
            accelerationExplanation.setText(accelerationText);

            accelerationExpl2.setText(accelerationText);
            forceExpl2.setText(forceText);

            answerInExplanation.setText(answerLabel.getText());
        }catch (Exception e){
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


    public void clickedAcceleration(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsFAcceleration.fxml"));
            Stage stage = (Stage) sAcceleration.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedForce(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsForce.fxml"));
            Stage stage = (Stage) sForce.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
