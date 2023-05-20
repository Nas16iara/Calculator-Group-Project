package com.group5.calculatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PhysicsVTimeController {
    PhysicsEquations physicsEquations = new PhysicsEquations();

    public Label displacementExpl2;
    public Button scientificButton;
    public Button sVelocity;
    public Button sDisplacement;
    public TextField displacement;
    public Label answerLabel;
    public TextField velocity;
    public Label VelocityExplanation;
    public Label displacementExplanation;
    public Label answerInExplanation;
    public Label velocityExpl2;
    public Button basicButton;
    public Button physicsButton;
    public Button chemistryButton;
    double distance;
    double velocity1;

    public void clickedEntered(ActionEvent actionEvent) throws Exception{
        //set text to double
        try {
            String velocityText = velocity.getText();
            velocity1 = Double.parseDouble(velocityText);

            String distanceText = displacement.getText();
            distance = Double.parseDouble(distanceText);

            double answer = physicsEquations.solveVeloTime(velocity1,distance);
            answerLabel.setText(Double.toString(answer));

            //Sets the explanation box
            VelocityExplanation.setText(velocity.getText());
            displacementExplanation.setText(displacement.getText());

            velocityExpl2.setText(velocity.getText());
            displacementExpl2.setText(displacement.getText());

            answerInExplanation.setText(answerLabel.getText());
        }
        catch (Exception e){
            answerLabel.setText("SYNTAX ERROR: NOT A NUMBER");
        }
    }
    public void clickedScientificButton(ActionEvent actionEvent) {
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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsVelocity.fxml"));
            Stage stage = (Stage) sVelocity.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedDisplacement(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsVDistance.fxml"));
            Stage stage = (Stage) sDisplacement.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }


}
