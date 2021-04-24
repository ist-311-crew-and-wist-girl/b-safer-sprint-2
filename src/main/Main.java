package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import main.model.business.Business;
import main.model.business.BusinessList;

import java.io.InputStream;

public class Main extends Application {

    // Method to attempt to correct issue with changing pages in documents
    private Stage stage;
    private final double MINIMUM_WINDOW_WIDTH = 700.0;
    private final double MINIMUM_WINDOW_HEIGHT = 400.0;

    Business currentBis;

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            stage = primaryStage;
            stage.setTitle("B-Safer");
            stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
            stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);
            goToLogin();
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Function to replace scene content
    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream stdin = Main.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Main.class.getResource(fxml));
        AnchorPane page;

        try {
            page = (AnchorPane) loader.load(stdin);
        } finally {
            stdin.close();
        }

        // Create new Scene
        Scene scene = new Scene(page, MINIMUM_WINDOW_WIDTH, MINIMUM_WINDOW_HEIGHT);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }

    // Methods to go to our current screens
    public void goToLogin() {
        try {
            LoginController login = (LoginController) replaceSceneContent("templates/login.fxml");
            login.setApp(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void goToBusinessList() {
        try {
            BusinessListController businessList = (BusinessListController) replaceSceneContent("templates/businessList.fxml");
            businessList.setApp(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void goToBusinessPage(Business bus) {
        try {

            BusinessPageController businessPage = (BusinessPageController) replaceSceneContent("templates/businessPage.fxml");
            businessPage.setApp(this, bus);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
