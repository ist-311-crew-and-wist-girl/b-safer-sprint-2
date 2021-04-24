package main.model.business;


public class Business {
//    private static final Map<String, String> BUSINESS = new HashMap<String, String>();
//    static {
//        BUSINESS.put("idNum", "10");
//        BUSINESS.put("businessName", "Michael's Pizza");
//        BUSINESS.put("businessAddress", "730 Cornwall Rd.");
//        BUSINESS.put("businessRating", "8.3");
//        BUSINESS.put("businessSafetyWarning", "Free hand sanitizer.");
//        BUSINESS.put("businessURL", "https://www.linkedin.com/in/jasonnucci/");
//        BUSINESS.put("businessPhone", "123-456-7890");
//    }

    private int idNum;
    private String BusinessName;
    private String BusinessAddress;
    private String BusinessRating;
    private String BusinessSafetyWarning;
    private String BusinessURL;
    private String BusinessPhone;

    public Business() {
    }

    public Business(int idNum, String businessName, String businessAddress, String businessRating, String businessSafetyWarning, String businessURL, String businessPhone) {
        this.idNum = idNum;
        BusinessName = businessName;
        BusinessAddress = businessAddress;
        BusinessRating = businessRating;
        BusinessSafetyWarning = businessSafetyWarning;
        BusinessURL = businessURL;
        BusinessPhone = businessPhone;
    }
    public Business(int idNum) {
        this.idNum = idNum;
    }



    public void setIdNum(int iDNum){
        this.idNum = iDNum;
    }
    public void setBusinessName(String businessName) {
        BusinessName = businessName;
    }
    public void setBusinessAddress(String businessAddress) {
        BusinessAddress = businessAddress;
    }
    public void setBusinessRating(String businessRating) {
        BusinessRating = businessRating;
    }
    public void setBusinessSafetyWarning(String businessSafetyWarning) {
        BusinessSafetyWarning = businessSafetyWarning;
    }
    public void setBusinessURL(String businessURL) {
        BusinessURL = businessURL;
    }
    public void setBusinessPhone(String businessPhone) {
        BusinessPhone = businessPhone;
    }

    public int getIdNum(){
        return this.idNum;
    }
    public String getBusinessName() {
        return BusinessName;
    }
    public String getBusinessAddress() {
        return BusinessAddress;
    }
    public String getBusinessRating() {
        return BusinessRating;
    }
    public String getBusinessSafetyWarning() {
        return BusinessSafetyWarning;
    }
    public String getBusinessURL() {
        return BusinessURL;
    }
    public String getBusinessPhone() {
        return BusinessPhone;
    }
}
