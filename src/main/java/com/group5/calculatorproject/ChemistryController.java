package com.group5.calculatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class ChemistryController {
    public Button density;
    public Button molarity;
    public Button mole;
    public Button molarMass;
    public Button cToF;
    public Button fToC;
    public Scene scene;
    public Button mainButton;


    public void clickedMolarMass(ActionEvent actionEvent) throws  IOException  {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MolarMassView.fxml"));
            Stage stage = (Stage) molarMass.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);

        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedDensity(ActionEvent actionEvent) throws  IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DensityView.fxml"));
            Stage stage = (Stage) density.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);

        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedC_TO_F(ActionEvent actionEvent) throws  IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("C_To_F_view.fxml"));
            Stage stage = (Stage) cToF.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedF_TO_C(ActionEvent actionEvent) throws  IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("F_TO_C_view.fxml"));
            Stage stage = (Stage) fToC.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedMolarity(ActionEvent actionEvent) throws  IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MolarityView.fxml"));
            Stage stage = (Stage) molarity.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedNumberOfMoles(ActionEvent actionEvent) throws  IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MoleView.fxml"));
            Stage stage = (Stage) mole.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedK_TO_C(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("K_TO_C_view.fxml"));
            Stage stage = (Stage) mole.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedC_TO_K(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("C_TO_K_view.fxml"));
            Stage stage = (Stage) mole.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedK_TO_F(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("K_TO_F_view.fxml"));
            Stage stage = (Stage) mole.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedF_TO_K(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("F_TO_K_view.fxml"));
            Stage stage = (Stage) fToC.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedMass(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MassView.fxml"));
            Stage stage = (Stage) fToC.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedVolume(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("VolumeView.fxml"));
            Stage stage = (Stage) fToC.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    public void clickedMain(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainPage.fxml"));
            Stage stage = (Stage) mainButton.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
