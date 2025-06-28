package am.picsartacademy.oop;

import am.picsartacademy.oop.models.Employee;
import am.picsartacademy.oop.models.Human;
import am.picsartacademy.oop.models.Student;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.firstName = "Alex";
        human.lastName = "Alexanyan";
        human.age = 22;
        human.gender = 'M';
        human.married = false;
        human.nationality = "Armenian";
        human.degree = true;

        human.speak();



        Human davit = new Human();
        davit.firstName = "Davit";
        davit.lastName = "Alexanyan";
        davit.age = 22;
        davit.gender = 'M';
        davit.married = false;
        davit.nationality = "Armenian";
        davit.degree = true;
        davit.speak();

        System.out.print(human.firstName + davit.lastName + human.age);


        Student artak = new Student();
        artak.firstName = "Artak";
        artak.lastName = "Alexanyan";
        artak.age = 22;
        artak.gender = 'M';
        artak.married = false;
        artak.nationality = "Armenian";
        artak.degree = true;
        artak.speak();


        Student laura = new Student();
        laura.firstName = "Laura";
        laura.lastName = "Alexanyan";
        laura.age = 22;
        artak.gender = 'F';
        artak.married = false;
        artak.nationality = "Armenian";
        artak.degree = true;
        laura.univertiy = "YSU";
        laura.nameOfProfessor = "Pr. Sargsyan";
        laura.averageGrade = 90;
        laura.paid = false;


        Employee emp = new Employee();
        emp.firstName = "Laura";
        emp.lastName = "Alexanyan";
        emp.age = 22;
        emp.gender = 'F';
        emp.married = false;
        emp.nationality = "Armenian";
        emp.manager = "Tigran";
        emp.position = "QA Engineer";
        emp.salary = 220000.66;


        emp.speak();
        davit.speak();
        laura.speak();



    }
}

