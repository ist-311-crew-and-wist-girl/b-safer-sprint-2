package main.model.business;

import java.util.HashMap;
import java.util.Map;

public class Business {
    private static final Map<String, String> BUSINESS = new HashMap<String, String>();
    static {
        BUSINESS.put("idNum", "10");
        BUSINESS.put("businessName", "Michael's Pizza");
        BUSINESS.put("businessAddress", "730 Cornwall Rd.");
        BUSINESS.put("businessRating", "8.3");
        BUSINESS.put("businessSafetyWarning", "Free hand sanitizer.");
        BUSINESS.put("businessURL", "https://www.linkedin.com/in/jasonnucci/");
        BUSINESS.put("businessPhone", "123-456-7890");
    }

    private int idNum;

    public Business(int idNum) {
        this.idNum = idNum;
    }

    public void setIdNum(int iDNum){
        this.idNum = iDNum;
    }

    public int getIdNum(){
        return this.idNum;
    }

    public String getBusinessName() {
        return BUSINESS.get("businessName");
    }

    public String getBusinessAddress() {
        return BUSINESS.get("businessAddress");
    }

    public String getBusinessRating() {
        return BUSINESS.get("businessRating");
    }

    public String getBusinessSafetyWarning() {
        return BUSINESS.get("businessSafetyWarning");
    }

    public String getBusinessURL(){
        return BUSINESS.get("businessURL");
    }

    public String getBusinessPhone(){
        return BUSINESS.get("businessPhone");
    }
}
