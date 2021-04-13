package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class BusinessListController extends AnchorPane implements Initializable {

    private Main app;

    public void setApp(Main app) {
        this.app = app;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    protected void openBusinessPage(){
//        try {
//            Main.setRoot("templates\\sample");
//        } catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
