package am.picsartacademy.oop.models.exceptions;

public class AgeException extends RuntimeException{
    public AgeException(){}
    public String toString(){
        return "Age cannot be negative";
    }
}
