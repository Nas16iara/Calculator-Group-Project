package com.group5.calculatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PhysicsVelocityController {
    PhysicsEquations physicsEquations = new PhysicsEquations();

    public TextField displacement;
    public Label answerLabel;
    public Label displacementExplanation;
    public Label answerInExplanation;
    public Label timeExplanation;
    public Button sTime;
    public Button sDisplacement;
    public Button scientificButton;
    public Button physicsButton;
    public Button chemistryButton;
    public Button basicButton;
    public Label displacementExpl2;
    public Label timeExpl2;
    double distance;
    @FXML
    TextField time;
    double time1;

    public void clickedEntered(ActionEvent actionEvent) throws Exception{
        try {
            //set to double
            String timeText = time.getText();
            time1 = Double.parseDouble(timeText);

            String distanceText = displacement.getText();
            distance = Double.parseDouble(distanceText);
            //set answer
            Double answer = physicsEquations.solveVelo(distance,time1);
            answerLabel.setText(answer.toString());

            //Sets the explanation box
            timeExplanation.setText(time.getText());
            displacementExplanation.setText(displacement.getText());

            timeExpl2.setText(time.getText());
            displacementExpl2.setText(displacement.getText());

            answerInExplanation.setText(answer.toString());
        }catch (Exception e){
            answerLabel.setText("SYNTAX ERROR: NOT A NUMBER");
        }
    }
    public void clickedScientificButton(ActionEvent actionEvent)throws IOException  {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ScientificCal.fxml"));
            Stage stage = (Stage) scientificButton.getScene().getWindow();
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

    public void clickedTime(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PhysicsVTime.fxml"));
            Stage stage = (Stage) sTime.getScene().getWindow();
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
