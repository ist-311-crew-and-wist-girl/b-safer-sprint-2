package main.model.business;

public class BusinessReview {
    private int rating;
    private String comment;
    private Business businessToReview;

    public BusinessReview(int rating, String comment, Business businessToReview) {
        this.rating = rating;
        this.comment = comment;
        this.businessToReview = businessToReview;
    }
}