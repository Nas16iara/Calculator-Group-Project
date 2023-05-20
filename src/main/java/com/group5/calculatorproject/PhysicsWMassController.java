package com.group5.calculatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PhysicsWMassController {
    PhysicsEquations physicsEquations = new PhysicsEquations();


    public Label answerInExplanation;

    public Button scientificButton;
    public Label answerLabel;

    public Button basicButton;
    public Button chemistryButton;
    public Button physicsButton;
    public Button sGravity;
    public Button sWeight;
    public TextField gravity;
    public TextField weight;
    public Label weightExplanation;
    public Label gravityExplanation;
    public Label weightExpl2;
    public Label gravityExpl2;
    double weight1;
    double gravity1;

    public void clickedEntered(ActionEvent actionEvent) {
        try {
            String weightText = weight.getText();
            weight1 = Double.parseDouble(weightText);

            String gravityText = gravity.getText();
            gravity1 = Double.parseDouble(gravityText);

            double answer = physicsEquations.solveWeightMass(weight1,gravity1);

            answerLabel.setText(Double.toString(answer));


            //Sets the explanation box
            weightExplanation.setText(weightText);
            gravityExplanation.setText(gravityText);

            gravityExpl2.setText(gravityText);
            weightExpl2.setText(weightText);

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

    public void clickedWeight(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsWeight.fxml"));
            Stage stage = (Stage) sWeight.getScene().getWindow();
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
}
