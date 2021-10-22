package modulo02.aula28.a01;

/** Correção da atividade da aula 28 - código de Maykon D Granemann */
public class Main {
    public static void main(String[] args) {
        Data data = new Data();

        People peopleOne = new People();
        peopleOne.name = "Inês";
        peopleOne.lastName = "Brasil";
        peopleOne.age = 32;

        Student student = new Student();
        student.name = "Jojo";
        student.lastName = "Calypso";
        student.age = 38;
        student.registration = "asdasd";
        student.group = "Do fundao";
        student.course = "VASP";

        data.add(peopleOne);
        data.add(student);

        People peopleTwo = new People();
        peopleTwo.name = "Inês";
        peopleTwo.lastName = "Brasil";
        peopleTwo.age = 32;

        boolean e = data.contains(peopleTwo);
        System.out.println(e);

        data.remove(student);
        System.out.println(data.contains(student));
    }
}
