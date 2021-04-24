package main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import main.model.business.Business;
import main.model.business.BusinessReview;
import main.model.business.ReviewLoader;

import java.net.URL;
import java.util.ResourceBundle;

public class BusinessReviewListController extends AnchorPane implements Initializable {

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private VBox scrollVBox;

    private Main app;
    private Business bus;




    public void setApp(Main app, Business bus) {
        this.app = app;
        this.bus = bus;
        ReviewLoader loader = new ReviewLoader(bus.getIdNum());
        for(BusinessReview rev : loader.getReviews()) {
            HBox revInfo = new HBox();

            //short for rating label
            Label ratLab = new Label("Rating:");
            revInfo.getChildren().add(ratLab);

            Label rat = new Label(rev.getRating()+"");
            revInfo.getChildren().add(rat);


            Label userLab = new Label("Username:");
            revInfo.getChildren().add(userLab);

            Label user = new Label(rev.getReviewer());
            revInfo.getChildren().add(user);


            scrollVBox.getChildren().add(revInfo);
            Label reviewComment = new Label(rev.getComment());
            scrollVBox.getChildren().add(reviewComment);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
