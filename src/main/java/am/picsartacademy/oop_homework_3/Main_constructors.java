package am.picsartacademy.oop_homework_3;

public class Main_constructors {
    public static void main(String[] args) {
        //in this way parameters will have their default values
        Subscription s = new Subscription();

        System.out.println(s.getUserEmail());    //null
        System.out.println(s.getIsActive());     //false
        System.out.println(s.getMonthlyPrice()); //0.0
        System.out.println(s.getEndDate());      //null
        System.out.println(s.getPlanName());     //null
        System.out.println();

        //is set name for s2, and name, monthlyPrice for s3. the other params has their default values
        Subscription s2 = new Subscription("Community");
        Subscription s3 = new Subscription("Community v2", 36.0);

        System.out.println(s2.getUserEmail());    //null
        System.out.println(s2.getIsActive());     //false
        System.out.println(s2.getMonthlyPrice()); //0.0
        System.out.println(s2.getEndDate());      //null
        System.out.println(s2.getPlanName());     //Community
        System.out.println();

        System.out.println(s3.getUserEmail());    //null
        System.out.println(s3.getIsActive());     //false
        System.out.println(s3.getMonthlyPrice()); //36.0
        System.out.println(s3.getEndDate());      //null
        System.out.println(s3.getPlanName());     //Community v2
        System.out.println();

        //used supers constructor
        TrialSubscription myTrial = new TrialSubscription("serine.galstyan98@gmail.com", "Free Trial Subscription", true);
//        PremiumSubscription plusSubscription = new PremiumSubscription("Paid PLUS subscription", 10.0);

        System.out.println(myTrial.getUserEmail());    //serine.galstyan98@gmail.com
        System.out.println(myTrial.getIsActive());     //true
        System.out.println(myTrial.getMonthlyPrice()); //0.0
        System.out.println(myTrial.getEndDate());      //null
        System.out.println(myTrial.getPlanName());     //Free Trial Subscription


        Subscription newUserSubscription = new Subscription("serine.galstyan98@gmail.com", "Free Trial Subscription", true);
        newUserSubscription.setEndDate("22.05");
        String status;

        if (newUserSubscription.getIsActive()) {
            status = "Active";
        } else status = "Inactive";

        String currentDate = "22.05";

        System.out.println();
        System.out.println("Profile information:");
        System.out.println("User email: " + newUserSubscription.getUserEmail());
        System.out.println("Subscription plan: " + myTrial.getPlanName());
        System.out.println("Monthly price: " + myTrial.getMonthlyPrice());
        System.out.println("Subscription status: " + status);
        System.out.println("Expiration date: " + newUserSubscription.getEndDate());

        System.out.println("\nPayment information:");
        if (currentDate == newUserSubscription.getEndDate()) {
            newUserSubscription.cancelSubscription();
        }
        System.out.println("Expired: " + newUserSubscription.getEndDate());
    }
}



