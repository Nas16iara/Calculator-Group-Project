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

public class MolarMassController {

    @FXML
    public TextField mass;
    @FXML
    public TextField numberOfMole;
    public Button back;
    public Label answerLabel;
    public void clickedResult(ActionEvent actionEvent) {
        String mass_value =mass.getText();
        double d= Double.parseDouble(mass_value);

        String mole_value =numberOfMole.getText();
        double d2= Double.parseDouble(mole_value);
        double d3= d/d2;
        String str=String.format("%.2f", d3);
        answerLabel.setText(str);

    }
    public void clickedBack(ActionEvent actionEvent) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ChemistryView.fxml"));
            Stage stage = (Stage) back.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
