package am.picsartacademy.oop_homework_3;

public class Subscription {
    protected String userEmail;
    protected String planName;
    protected double monthlyPrice;
    protected String endDate;
    protected boolean isActive;

    //constructors
    public Subscription() {
    } //default constructor

    public Subscription(String planName) {
        this.planName = planName;
    }

    public Subscription(String planName, double monthlyPrice) {
        this.planName = planName;
        this.monthlyPrice = monthlyPrice;
    }

    public Subscription(String userEmail, String planName, boolean isActive) {
        this.userEmail = userEmail;
        this.planName = planName;
        this.isActive = isActive;
    }


    // setters, getters
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanName() {
        return planName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setMonthlyPrice(double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsActive() {
        return isActive;
    }

    //methods
    public void cancelSubscription() {
        isActive = false;
        System.out.println("Subscription cancelled");
    }

    public void calculatePrice() {
        System.out.println("Monthly price depend on subscription plan");
    }

    //method overloading
    public void calculatePrice(double monthlyPrice) {
        System.out.println("You have trial subscription plan, your monthly charge(in USD) is: " + monthlyPrice);
    }

}
