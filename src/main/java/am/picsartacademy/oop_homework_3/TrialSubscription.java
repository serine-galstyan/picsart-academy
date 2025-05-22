package am.picsartacademy.oop_homework_3;

public class TrialSubscription extends Subscription{
    private int trialDays;

    public TrialSubscription(String userEmail, String planName, boolean isActive){
        super(userEmail, planName, isActive);
    }

    public TrialSubscription() {
    }

    public void setTrialDays(int trialDays){
        this.trialDays = trialDays;
    }

    public int getTrialDays(){
        return trialDays;
    }

//    public void providePrice(String planName){
//        if(planName.equals("Free Trial")){
//            System.out.println("You won't be charged, you have free trial subscription");
//        }
//    }

    @Override
    public void calculatePrice(){
        System.out.println("You have free trial subscription plan");
    }













}
