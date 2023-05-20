package com.group5.calculatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PhysicsWeightController {
    PhysicsEquations physicsEquations = new PhysicsEquations();

    public Label answerInExplanation;
    public Button scientificButton;

    public Label answerLabel;

    public Button basicButton;
    public Button chemistryButton;
    public Button physicsButton;
    public Button sMass;
    public TextField mass;
    public Label massExplanation;
    public Label massExpl2;
    public Button sGravity;
    public TextField gravity;
    public Label gravityExplanation;
    public Label gravityExpl2;
    double gravity1;
    double mass1;

    public void clickedEntered(ActionEvent actionEvent) {
        try {
            String gravityText = gravity.getText();
            gravity1 = Double.parseDouble(gravityText);

            String massText = mass.getText();
            mass1 = Double.parseDouble(massText);

            double answer = physicsEquations.solveWeight(mass1,gravity1);

            answerLabel.setText(Double.toString(answer));


            //Sets the explanation box
            gravityExplanation.setText(gravityText);
            massExplanation.setText(massText);

            massExpl2.setText(massText);
            gravityExpl2.setText(gravityText);

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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsVTime.fxml"));
            Stage stage = (Stage) basicButton.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
    public void clickedChemistry(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsVTime.fxml"));
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
    public void clickedGravity(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsWGravitation.fxml"));
            Stage stage = (Stage) sGravity.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
    public void clickedMass(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsWMass.fxml"));
            Stage stage = (Stage) sMass.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
