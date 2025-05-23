package am.picsartacademy.oop_homework_3;

public class MainOvers {
    public static void main(String[] args) {

        TrialSubscription myTrial = new TrialSubscription("serine.galstyan98@gmail.com", "Free Trial Subscription", true);
        myTrial.setTrialDays(6);
        myTrial.setEndDate("22.05");

        String status;
        String currentDate = "22.05";
        if (myTrial.getIsActive()) {
            status = "Active";
        } else status = "Inactive";

        System.out.println("Profile information:");
        System.out.println("User email: " + myTrial.getUserEmail());
        System.out.println("Subscription plan: " + myTrial.getPlanName());
        System.out.println("Monthly price: " + myTrial.getMonthlyPrice());
        System.out.println("Subscription status: " + status);
        System.out.println("Expiration date: " + myTrial.getEndDate());


        System.out.println("\nPayment information:");
        if (currentDate == myTrial.getEndDate()) {
            myTrial.cancelSubscription();
        }
        System.out.println("Expired: " + myTrial.getEndDate());

//        myTrial.calculatePrice();

        System.out.println();
        PremiumSubscription newPremium = new PremiumSubscription("Premium subscription", 10.0);
        newPremium.setUserEmail("siranush91@gmail.com");
        newPremium.setAccessKey("SDNSQSgJ4bWnojm7s0xUM8_ZeLeiU6ssySrigmdn-IE");
        newPremium.setIsActive(true);


        System.out.println("New profile information:");
        System.out.println("User email: " + newPremium.getUserEmail());
        System.out.println("Subscription plan: " + newPremium.getPlanName());
        newPremium.calculatePrice(newPremium.getMonthlyPrice());
        System.out.println("Subscription status: " + newPremium.getIsActive());
        System.out.println("Your access key for paid features: " + newPremium.getAccessKey());
    }
}

