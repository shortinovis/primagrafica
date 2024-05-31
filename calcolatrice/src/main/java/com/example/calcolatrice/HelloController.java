package com.example.calcolatrice;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField operando1;
    @FXML
    private TextField firstAdd;
    @FXML
    private TextField secondAdd;


    @FXML
    protected void divButton() {
        int v1=Integer.parseInt(firstAdd.getText());
        int v2=Integer.parseInt(secondAdd.getText());
        int divisione=v1/v2;
        operando1.setText(String.valueOf(divisione));
    }
    @FXML
    protected void plusButton(){
        int v1=Integer.parseInt(firstAdd.getText());
        int v2=Integer.parseInt(secondAdd.getText());
        int somma=v1+v2;
        operando1.setText(String.valueOf(somma));
    }
    @FXML
    protected void minusButton(){
        int v1=Integer.parseInt(firstAdd.getText());
        int v2=Integer.parseInt(secondAdd.getText());
        int sottrazione=v1-v2;
        operando1.setText(String.valueOf(sottrazione));
    }
    @FXML
    protected void perButton(){
        int v1=Integer.parseInt(firstAdd.getText());
        int v2=Integer.parseInt(secondAdd.getText());
        int molt=v1*v2;
        operando1.setText(String.valueOf(molt));
    }

}