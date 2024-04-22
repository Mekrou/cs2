package com.example.lab12;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label result;
    @FXML
    private TextField num1;
    @FXML
    private TextField num2;

    @FXML
    protected void onClearButtonClick() {
        num1.setText("");
        num2.setText("");
        result.setText("");
    }

    @FXML
    protected void onAddButtonClick() {
        try {
            int firstNum = Integer.parseInt(num1.getText());
            int secondNum = Integer.parseInt(num2.getText());
            String sum = String.valueOf(Calc.add(firstNum, secondNum));
            result.setText(sum);
        } catch (NumberFormatException e) {
            System.out.println("Could not get an integer from at least one input!");
        }
    }
}