package am.picsartacademy.oop_homework_3;

public class PremiumSubscription extends Subscription {
    private String accessKey;

    public PremiumSubscription(String planName, double monthlyPrice) {
        super(planName, monthlyPrice);
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getAccessKey() {
        return accessKey;
    }


    public void calculatePrice(double monthlyPrice) {
        System.out.println("You have PREMIUM subscription plan, your monthly charge(in USD) is: " + monthlyPrice);
    }


}
