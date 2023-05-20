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

public class C_TO_K_Controller {
    @FXML
    public TextField celsiusTemp;
    public Label answerLabel;
    public Button back;
    public void clickedResult(ActionEvent actionEvent) {
        String c_value =celsiusTemp.getText();
        double d= Double.parseDouble(c_value);
        double c= d + 273.15;
        double d3= c;
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
