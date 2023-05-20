package com.group5.calculatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ScientificCalController{
    
    @FXML
    public TextField equationBar;
    
    //Change science Button

    public Button scientificButton;
    public Button chemistryButton;
    public Button physicsButton;
    public Button basicButton;
   
    //Number buttons
    public Button zeroButton;
    public Button oneButton;
    public Button twoButton;
    public Button threeButton;
    public Button fourButton;
    public Button fiveButton;
    public Button sixButton;
    public Button sevenButton;
    public Button eightButton;
    public Button nineButton;
    public Button dotButton;
    public TextField displayRadOrDeg;
    public Button mainPageButton;

    //Variables
    String neg_pos = "+";
    double num1;
    double result;
    double num2;
    String answer;
    String operation;

    String rad_deg = "rad";


    public double convertToRad(double radValue){
        return Math.toRadians(radValue);
    }
    //Signs
    @FXML
    public void clickedNegSign(ActionEvent actionEvent) {
        neg_pos = "-";
    }
    @FXML
    public void clickedPosSign(ActionEvent actionEvent) {
        neg_pos = "+";
    }
    public void clickedRad(ActionEvent actionEvent) {
        rad_deg = "rad";
        displayRadOrDeg.setText("RAD");
    }
    public void clickedDEG(ActionEvent actionEvent) {
        rad_deg = "deg";
        displayRadOrDeg.setText("DEG");
    }






    //Numbers
    @FXML
    public void clickedZero(ActionEvent actionEvent) {

        String num = equationBar.getText() + zeroButton.getText();
        equationBar.setText(num);
    }
    @FXML
    public void clickedOne(ActionEvent actionEvent) {
        String num;
        if(neg_pos.equals("-")) {
            num = equationBar.getText() +"-"+oneButton.getText();
        }
        else {
            num = equationBar.getText() +oneButton.getText();
        }
        equationBar.setText(num);
    }
    @FXML
    public void clickedTwo(ActionEvent actionEvent) {
        String num;
        if(neg_pos.equals("-")) {
            num= equationBar.getText()  +"-"+ twoButton.getText();
        }
        else{
            num = equationBar.getText() + twoButton.getText();
        }
        equationBar.setText(num);
    }
    @FXML
    public void clickedThree(ActionEvent actionEvent) {
        String num;
        if(neg_pos.equals("-")) {
            num= equationBar.getText()  +"-"+ threeButton.getText();
        }
        else{
            num = equationBar.getText() + threeButton.getText();
        }
        equationBar.setText(num);
    }
    @FXML
    public void clickedFour(ActionEvent actionEvent) {
        String num;
        if(neg_pos.equals("-")) {
            num= equationBar.getText()  +"-"+ fourButton.getText();
        }
        else{
            num = equationBar.getText() + fourButton.getText();
        }
        equationBar.setText(num);
    }
    @FXML
    public void clickedFive(ActionEvent actionEvent) {
        String num;
        if(neg_pos.equals("-")) {
            num= equationBar.getText()  +"-"+ fiveButton.getText();
        }
        else{
            num = equationBar.getText() + fiveButton.getText();
        }
        equationBar.setText(num);
    }
    @FXML
    public void clickedSix(ActionEvent actionEvent) {
        String num;
        if(neg_pos.equals("-")) {
            num= equationBar.getText()  +"-"+ sixButton.getText();
        }
        else{
            num = equationBar.getText() + sixButton.getText();
        }
        equationBar.setText(num);
    }
    @FXML
    public void clickedSeven(ActionEvent actionEvent) {
        String num;
        if(neg_pos.equals("-")) {
            num= equationBar.getText()  +"-"+ sevenButton.getText();
        }
        else{
            num = equationBar.getText() + sevenButton.getText();
        }
        equationBar.setText(num);
    }
    @FXML
    public void clickedEight(ActionEvent actionEvent) {
        String num;
        if(neg_pos.equals("-")) {
            num= equationBar.getText()  +"-"+ eightButton.getText();
        }
        else{
            num = equationBar.getText() + eightButton.getText();
        }
        equationBar.setText(num);
    }
    @FXML
    public void clickedNine(ActionEvent actionEvent) {
        String num;
        if(neg_pos.equals("-")) {
            num= equationBar.getText()  +"-"+ nineButton.getText();
        }
        else{
            num = equationBar.getText() + nineButton.getText();
        }
        equationBar.setText(num);
    }
    @FXML
    public void clickedPi(ActionEvent actionEvent) {
        double num = Math.PI;
        equationBar.setText(String.valueOf(num));
    }

    public void clickedE(ActionEvent actionEvent) {
        double num = Math.E;
        equationBar.setText(String.valueOf(num));
    }

    @FXML
    public void clickedDecimal(ActionEvent actionEvent) {
        if(!equationBar.getText().contains(".")){
            equationBar.setText(equationBar.getText() + dotButton.getText());
        }
    }



    //Basic operations
    @FXML
    public void clickedPlus(ActionEvent actionEvent) {
        num1 = Double.parseDouble(equationBar.getText());
        equationBar.setText("");
        operation = "+";
    }
    @FXML
    public void clickedMinus(ActionEvent actionEvent) {
        num1 = Double.parseDouble(equationBar.getText());
        equationBar.setText("");
        operation = "-";
    }
    @FXML
    public void clickedDivision(ActionEvent actionEvent) {
        num1 = Double.parseDouble(equationBar.getText());
        equationBar.setText("");
        operation = "/";
    }
    @FXML
    public void clickedMultiplication(ActionEvent actionEvent) {
        num1 = Double.parseDouble(equationBar.getText());
        equationBar.setText("");
        operation = "*";
    }
    public void clickedMod(ActionEvent actionEvent) {
        num1 = Double.parseDouble(equationBar.getText());
        equationBar.setText("");
        operation = "%";
    }





    //Power function
    @FXML
    public void clickedSqTwo(ActionEvent actionEvent) {
        double numSq = Double.parseDouble(equationBar.getText());
        numSq = Math.pow(numSq,2);
        equationBar.setText(String.valueOf(numSq));
    }
    @FXML
    public void clickedSqB(ActionEvent actionEvent) {
        num1 = Double.parseDouble(equationBar.getText());
        equationBar.setText("");
        operation = "^";

    }
    @FXML
    public void clickedSquareCube(ActionEvent actionEvent) {
        double numSq = Double.parseDouble(equationBar.getText());
        numSq = Math.pow(numSq,3);
        equationBar.setText(String.valueOf(numSq));

    }
    public void clickedESqB(ActionEvent actionEvent) {
        double eSqB = Double.parseDouble(equationBar.getText());
        eSqB = Math.pow(Math.E,eSqB);
        equationBar.setText(String.valueOf(eSqB));
    }
    public void clicked10SqA(ActionEvent actionEvent) {
        num1 = Double.parseDouble(equationBar.getText());
        equationBar.setText("");
        operation = "EE";
    }





    //Root functions
    @FXML
    public void clickedSqrtTwo(ActionEvent actionEvent) {
        double numSqrt = Double.parseDouble(equationBar.getText());
        numSqrt = Math.sqrt(numSqrt);
        equationBar.setText(String.valueOf(numSqrt));
    }
    @FXML
    public void clickedSqrtA(ActionEvent actionEvent) {
        num1 = Double.parseDouble(equationBar.getText());
        equationBar.setText("");
        operation = "√";
    }


    //Log functions, factorials, and :
    public void clickedLog2(ActionEvent actionEvent) {
        double log2 = Double.parseDouble(equationBar.getText());
        log2 = Math.log(log2) / Math.log(2);
        equationBar.setText(String.valueOf(log2));
    }
    public void clickedNaturalLog(ActionEvent actionEvent) {
        double ln = Double.parseDouble(equationBar.getText());
        ln = Math.log(ln);
        equationBar.setText(String.valueOf(ln));
    }
    public void clickedLog(ActionEvent actionEvent) {
        double log10 = Double.parseDouble(equationBar.getText());
        log10 = Math.log10(log10) / Math.log(2);
        equationBar.setText(String.valueOf(log10));
    }
    public void clickedInverse(ActionEvent actionEvent) {
        double inverse = Double.parseDouble(equationBar.getText());
        inverse = (1 / inverse);
        equationBar.setText(String.valueOf(inverse));
    }












    //Percentage and fraction
    @FXML
    public void clickedPercent(ActionEvent actionEvent) {
        num1 = Double.parseDouble(equationBar.getText());
        equationBar.setText("");
        operation = "% of";
    }
    @FXML
    public void clickedFract(ActionEvent actionEvent) {
        num1 = Double.parseDouble(equationBar.getText());
        equationBar.setText("");
        operation = "/";
    }






    //Trig functions
    @FXML
    public void clickedSin(ActionEvent actionEvent) {
        double sin = Double.parseDouble(equationBar.getText());
        if(rad_deg.equals("deg")){
            sin = convertToRad(sin);
        }
        sin = Math.sin(sin);
        equationBar.setText(String.valueOf(sin));
    }
    @FXML
    public void clickedSec(ActionEvent actionEvent) {
        double sec = Double.parseDouble(equationBar.getText());
        if(rad_deg.equals("deg")){
            sec = convertToRad(sec);
        }
        sec = 1 / Math.cos(sec);
        equationBar.setText(String.valueOf(sec));
    }
    @FXML
    public void clickedCos(ActionEvent actionEvent) {
        double cos = Double.parseDouble(equationBar.getText());
        if(rad_deg.equals("deg")){
            cos = convertToRad(cos);
        }
        cos = Math.cos(cos);
        equationBar.setText(String.valueOf(cos));
    }
    @FXML
    public void clickedCsc(ActionEvent actionEvent) {
        double csc = Double.parseDouble(equationBar.getText());
        if(rad_deg.equals("csc")){
            csc = convertToRad(csc);
        }
        csc = 1 / Math.sin(csc);
        equationBar.setText(String.valueOf(csc));
    }
    @FXML
    public void clickTan(ActionEvent actionEvent) {
        double tan = Double.parseDouble(equationBar.getText());
        if(rad_deg.equals("deg")){
            tan = convertToRad(tan);
        }
        tan = Math.tan(tan);
        equationBar.setText(String.valueOf(tan));
    }
    @FXML
    public void clickedCot(ActionEvent actionEvent) {
        double cot = Double.parseDouble(equationBar.getText());
        if(rad_deg.equals("deg")){
            cot = convertToRad(cot);
        }
        cot = 1 / Math.tan(cot);
        equationBar.setText(String.valueOf(cot));
    }









    //Non math functions
    @FXML
    public void clickedEnter(ActionEvent actionEvent) {
        try {
           num2 = Double.parseDouble(equationBar.getText());
           switch (operation) {
               case "+":
                   result = num1 + num2;
                   answer = String.format("%.2f", result);
                   equationBar.setText(answer);
                   break;
               case "-":
                   result = num1 - num2;
                   answer = String.format("%.2f", result);
                   equationBar.setText(answer);
                   break;
               case "*":
                   result = num1 * num2;
                   answer = String.format("%.2f", result);
                   equationBar.setText(answer);
                   break;
               case "/":
                   result = num1 / num2;
                   answer = String.format("%.2f", result);
                   equationBar.setText(answer);
                   break;
               case "^":
                   result = Math.pow(num1,num2);
                   answer = String.format("%.2f", result);
                   equationBar.setText(answer);
                   break;
               case "%":
                   result = num1 % num2;
                   answer = String.format("%.2f", result);
                   equationBar.setText(answer);
                   break;
               case "% of":
                   result = (num1 / 100) * num2;
                   answer = String.format("%.2f", result);
                   equationBar.setText(answer);
                   break;
               case"√":
                   result = Math.round(Math.pow(num2,(1/ num1)));
                   answer = String.format("%.2f", result);
                   equationBar.setText(answer);
                   break;
               case"EE":
                   result = num1 * Math.pow(10,num2);
                   answer = String.format("%.2f", result);
                   equationBar.setText(answer);
                   break;
           }

        }catch (ArithmeticException e){
            equationBar.setText("MATH ERROR");
        }
        catch (Exception e){
            equationBar.setText("SYNTAX ERROR");
        }
    }
    @FXML
    public void clickedClear(ActionEvent actionEvent)  {
        equationBar.setText("");
    }
    public void clickedBackspace(ActionEvent actionEvent) {
        String backspace;
        if(equationBar.getText().length() > 0){
            StringBuilder stringBuilder = new StringBuilder(equationBar.getText());
            stringBuilder.deleteCharAt(equationBar.getText().length() - 1);
            backspace = stringBuilder.toString();
            equationBar.setText(backspace);
        }
    }



   //Change scenes
    public void clickedPhysics(ActionEvent event) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Physics.fxml"));
            Stage stage = (Stage) physicsButton.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
    public void clickedScientific(ActionEvent actionEvent) {
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


    public void clickedMain(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainPage.fxml"));
            Stage stage = (Stage) mainPageButton.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}