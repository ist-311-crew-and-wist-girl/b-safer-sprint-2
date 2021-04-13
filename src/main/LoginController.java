package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import main.model.security.Authenticate;
import main.model.users.ActorUser;

import java.util.ResourceBundle;
import java.net.URL;

public class LoginController extends AnchorPane implements Initializable {
    @FXML
    TextField userNameEntry;

    @FXML
    TextField passwordEntry;

    @FXML
    Text actiontarget;

    private Main app;

    public void setApp(Main app) {
        this.app = app;
    }

    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
        userNameEntry.setPromptText("Enter your user name");
        passwordEntry.setPromptText("Enter your password");
    }

    @FXML protected void handleSignInButtonAction(ActionEvent event) {
        ActorUser user = new ActorUser(userNameEntry.getText(), passwordEntry.getText());
        if (Authenticate.validate(user.getUsername(), user.getPassword())) {
            try {
                app.goToBusinessList();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            actiontarget.setText("Your user name or password is incorrect!");
        }
    }
}
