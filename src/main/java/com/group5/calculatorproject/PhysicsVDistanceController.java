package com.group5.calculatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PhysicsVDistanceController {
    PhysicsEquations physicsEquations = new PhysicsEquations();


    public Label timeExpl2;
    public Label velocityExpl2;
    public Label answerInExplanation;
    public Label timeExplanation;
    public Label velocityExplanation;
    public Label answerLabel;
    public TextField time;
    public TextField velocity;
    public Button chemistryButton;
    public Button basicButton;
    public Button physicsButton;

    public Button scientificButton;
    public Button sVelocity;
    public Button sTime;
    double velocity1;
    double time1;

    public void clickedEntered(ActionEvent actionEvent) {
        try {
            //set to double
            String velocityText = velocity.getText();
            velocity1 = Double.parseDouble(velocityText);

            String distanceText = time.getText();
            time1 = Double.parseDouble(distanceText);

            //solves
            double answer = physicsEquations.solveDistance(velocity1,time1);
            answerLabel.setText(Double.toString(answer));
            //Sets the explanation box
            velocityExplanation.setText(velocity.getText());
            timeExplanation.setText(time.getText());

            timeExpl2.setText(velocity.getText());
            velocityExpl2.setText(time.getText());

            answerInExplanation.setText(answerLabel.getText());
        }
        catch (Exception e){
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
}
