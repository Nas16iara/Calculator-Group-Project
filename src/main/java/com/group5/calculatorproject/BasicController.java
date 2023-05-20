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

public class BasicController {
    @FXML
    public TextField equationBar;
    public Button mainButton;
    int num1;
    int num2;
    int result;
    String answer;
    String operation;

    public void clickZero(ActionEvent actionEvent) {
        String num = equationBar.getText() + "0";
        equationBar.setText(num);
    }
    public void clickOne(ActionEvent actionEvent) {
        String num = equationBar.getText() + "1";
        equationBar.setText(num);
    }
    public void clickTwo(ActionEvent actionEvent) {

        String num = equationBar.getText() + "2";
        equationBar.setText(num);
    }
    public void clickThree(ActionEvent actionEvent) {
        String num = equationBar.getText() + "3";
        equationBar.setText(num);
    }
    public void clickFour(ActionEvent actionEvent) {
        String num = equationBar.getText() + "4";
        equationBar.setText(num);
    }
    public void clickFive(ActionEvent actionEvent) {

        String num = equationBar.getText() + "5";
        equationBar.setText(num);
    }
    public void clickSix(ActionEvent actionEvent) {
        String num = equationBar.getText() + "6";
        equationBar.setText(num);
    }
    public void clickSeven(ActionEvent actionEvent) {
        String num = equationBar.getText() + "7";
        equationBar.setText(num);
    }

    public void clickEight(ActionEvent actionEvent) {

        String num = equationBar.getText() + "8";
        equationBar.setText(num);
    }

    public void clickNine(ActionEvent actionEvent) {
        String num = equationBar.getText() + "9";
        equationBar.setText(num);
    }
    public void clickClear(ActionEvent actionEvent) {

        equationBar.setText("");
    }
    public void clickEqual(ActionEvent actionEvent) {

            num2 = Integer.parseInt(equationBar.getText());
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    answer = Integer.toString(result);
                    equationBar.setText(answer);
                    break;
                case "-":
                    result = num1 - num2;
                    answer = Integer.toString(result);
                    equationBar.setText(answer);
                    break;
                case "*":
                    result = num1 * num2;
                    answer = Integer.toString(result);
                    equationBar.setText(answer);
                    break;
                case "/":
                    result = num1 / num2;
                    answer = Integer.toString(result);
                    equationBar.setText(answer);
                    break;

            }



        }
    public void clickDivide(ActionEvent actionEvent) {
        num1 = Integer.parseInt(equationBar.getText());
        equationBar.setText("");
        operation = "/";
    }
    public void clickPlus(ActionEvent actionEvent) {
        num1 = Integer.parseInt(equationBar.getText());
        equationBar.setText("");
        operation = "+";
    }
    public void clickMinus(ActionEvent actionEvent) {
        num1 = Integer.parseInt(equationBar.getText());
        equationBar.setText("");
        operation = "-";
    }
    public void clickMultiply(ActionEvent actionEvent) {
        num1 = Integer.parseInt(equationBar.getText());
        equationBar.setText("");
        operation = "*";
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