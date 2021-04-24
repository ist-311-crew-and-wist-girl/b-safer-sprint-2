package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class BusinessReviewController {

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
    public void setApp(Main app) {
        this.app = app;
    }


    //Return to BusinessPage
    public void goBack(ActionEvent actionEvent) {
    }



    //submit review to storage
    public void submit(ActionEvent actionEvent) {
    }
}
