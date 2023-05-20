module com.group5.calculatorproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.group5.calculatorproject to javafx.fxml;
    exports com.group5.calculatorproject;
}