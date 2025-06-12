package com.example.tpsystem.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML private Label statusLabel;

    @FXML private RegexPanelController regexPanelController;
    @FXML private AnalysisViewController analysisViewController;
    @FXML private BatchProcessingController batchProcessingController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Pass reference to this controller to child controllers
        if (regexPanelController != null) {
            regexPanelController.setMainController(this);
        }

        if (analysisViewController != null) {
            System.out.println("Setting analysis view controller");
            analysisViewController.setMainController(this);
        }

        if (batchProcessingController != null) {
            batchProcessingController.setMainController(this);
        }

    }

    /**
     * Updates the status text in the main status bar.
     * @param message The message to display
     */
    public void showStatus(String message) {
        javafx.application.Platform.runLater(() -> statusLabel.setText(message));
    }
}