package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import main.model.business.Business;

import java.net.URL;
import java.util.ResourceBundle;

public class BusinessPageController extends AnchorPane implements Initializable {

    @FXML
    public Label businessNameLabel;

    @FXML
    public Label addressLabel;

    @FXML
    public Label ratingLabel;

    @FXML
    public Label safetyWarningLabel;

    @FXML
    public Label urlLabel;

    @FXML
    public Label phoneLabel;

    private Main app;

    Business business;

    public void setApp(Main app, Business businessToSet) {
        this.business = businessToSet;
        this.app = app;

        businessNameLabel.setText(business.getBusinessName());
        businessNameLabel.setVisible(true);
        addressLabel.setText(business.getBusinessAddress());
        addressLabel.setVisible(true);
        ratingLabel.setText(business.getBusinessRating());
        ratingLabel.setVisible(true);
        safetyWarningLabel.setText(business.getBusinessSafetyWarning());
        safetyWarningLabel.setVisible(true);
        urlLabel.setText(business.getBusinessURL());
        urlLabel.setVisible(true);
        phoneLabel.setText(business.getBusinessPhone());
        phoneLabel.setVisible(true);

    }

    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
    }
}
