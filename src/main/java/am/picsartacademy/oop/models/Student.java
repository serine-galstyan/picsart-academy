package am.picsartacademy.oop.models;

public class Student extends Human {
    public String univertiy;
    public String nameOfProfessor;
    public int averageGrade;
    public boolean paid;


    @Override
    public void speak(){
        System.out.println("I am Speaking Student!");
    }
}
