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

public class F_TO_K_Controller {
    @FXML
    public TextField fahrenheitTemp;
    public Label answerLabel;
    public Button back;
    public void clickedResult(ActionEvent actionEvent) {
        String f_value =fahrenheitTemp.getText();
        double df= Double.parseDouble(f_value);
        double cf =((df -32.0)*(5.0/9.0))+273.15;
        double d3= cf;
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
