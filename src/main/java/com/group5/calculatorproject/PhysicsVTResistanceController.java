package com.group5.calculatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PhysicsVTResistanceController {
    PhysicsEquations physicsEquations = new PhysicsEquations();


    public Label answerInExplanation;
    public Button scientificButton;
    public Label answerLabel;

    public Button basicButton;
    public Button chemistryButton;
    public Button physicsButton;
    public Button sCurrent;

    public TextField voltage;
    public Button sVoltage;
    public Label voltageExplanation;
    public Label voltageExpl2;
    public TextField current;
    public Label currentExpl2;
    public Label currentExplanation;
    double voltage1;
    double current1;

    public void clickedEntered(ActionEvent actionEvent) {
        try {
            String resistanceText = current.getText();
            current1 = Double.parseDouble(resistanceText);

            String voltageText = voltage.getText();
            voltage1 = Double.parseDouble(voltageText);

            double answer = physicsEquations.solveResistance(voltage1,current1);

            answerLabel.setText(Double.toString(answer));


            //Sets the explanation box
            currentExplanation.setText(resistanceText);
            voltageExplanation.setText(voltageText);

            voltageExpl2.setText(voltageText);
            currentExpl2.setText(resistanceText);

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
    public void clickedVoltage(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsVoltage.fxml"));
            Stage stage = (Stage) sVoltage.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedCurrent(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsVTCurrent.fxml"));
            Stage stage = (Stage) sCurrent.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
