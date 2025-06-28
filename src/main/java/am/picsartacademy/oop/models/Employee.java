package am.picsartacademy.oop.models;

public class Employee extends Human {
    public double salary;
    public String position;
    public String manager;
    public String company;

    @Override
    public void speak(){
        System.out.println("I am Speaking Employee!");
    }
}

