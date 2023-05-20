package com.group5.calculatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PhysicsWLFrequencyController {
    PhysicsEquations physicsEquations = new PhysicsEquations();



    public Label answerInExplanation;
    public Button scientificButton;
    public Label answerLabel;

    public Button basicButton;
    public Button chemistryButton;
    public Button physicsButton;
    public Button sSpeed;

    public TextField speed;

    public Label speedExplanation;
    public Label speedExpl2;
    public Button sWavelength;
    public TextField wavelength;
    public Label wavelengthExplanation;
    public Label wavelengthExpl2;
    double speed1;
    double wavelength1;

    public void clickedEntered(ActionEvent actionEvent) {
        try {
            String wavelengthText = wavelength.getText();
            wavelength1 = Double.parseDouble(wavelengthText);

            String speedText = speed.getText();
            speed1= Double.parseDouble(speedText);

            double answer = physicsEquations.solveFrequency(wavelength1,speed1);

            answerLabel.setText(Double.toString(answer));


            //Sets the explanation box
            wavelengthExplanation.setText(wavelengthText);
            speedExplanation.setText(speedText);

            speedExpl2.setText(speedText);
            wavelengthExpl2.setText(wavelengthText);

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
    public void clickedSpeed(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsWLSpeed.fxml"));
            Stage stage = (Stage) sSpeed.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }


    public void clickedWavelength(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsWavelength.fxml"));
            Stage stage = (Stage) sWavelength.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
