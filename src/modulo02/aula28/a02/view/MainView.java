package modulo02.aula28.a02.view;

import modulo02.aula28.a02.controller.PeopleController;
import modulo02.aula28.a02.controller.StudentController;
import modulo02.aula28.a02.model.People;
import modulo02.aula28.a02.model.Student;

public class MainView {
    public static void main(String[] args) {
        PeopleController peopleController = new PeopleController();
        StudentController studentController = new StudentController();

        People peopleOne = new People();
        peopleOne.name = "Laura";
        peopleOne.lastName = "Palmer";
        peopleOne.age = 17;

        Student student = new Student();
        student.name = "Audrey";
        student.lastName = "Horne";
        student.age = 18;
        student.registration = "395823";
        student.group = "D";
        student.course = "Sistemas de Informação";

        peopleController.create(peopleOne);
        studentController.create(student);

        People peopleTwo = new People();
        peopleTwo.name = "Laura";
        peopleTwo.lastName = "Palmer";
        peopleTwo.age = 17;

        boolean e = peopleController.contains(peopleTwo);
        System.out.println(e);

        studentController.delete(student);
        System.out.println(studentController.contains(student));
    }
}
