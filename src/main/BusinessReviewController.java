package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import main.model.business.Business;

import java.net.URL;
import java.util.ResourceBundle;

public class BusinessReviewController extends AnchorPane implements Initializable {

    @FXML
    private RadioButton radio1;

    @FXML
    private ToggleGroup rating;

    @FXML
    private RadioButton radio2;

    @FXML
    private RadioButton radio3;

    @FXML
    private RadioButton radio4;

    @FXML
    private RadioButton radio5;

    @FXML
    private TextArea comment;

    @FXML
    private Button back;

    @FXML
    private Button submit;


    //Application control
    private Main app;
    private Business businessToReview;

    public void setApp(Main app, Business bus) {
        this.app = app;
        this.businessToReview = bus;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    //Return to BusinessPage
    public void goBack(ActionEvent actionEvent) {
        app.goToBusinessPage(businessToReview);
    }



    //submit review to storage
    public void submit(ActionEvent actionEvent) {
        //Ties in to XML writer
    }


}
