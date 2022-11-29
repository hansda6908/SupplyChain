package com.example.supplychain;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

// the backend of the project like the buttons
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}