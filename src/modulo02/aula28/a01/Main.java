package modulo02.aula28.a01;

/** Correção da atividade da aula 28 - código de Maykon D Granemann */
public class Main {
    public static void main(String[] args) {
        Data data = new Data();

        People peopleOne = new People();
        peopleOne.name = "Laura";
        peopleOne.lastName = "Palmer";
        peopleOne.age = 17;

        Student student = new Student();
        student.name = "Audrey";
        student.lastName = "Horne";
        student.age = 18;
        student.registration = "972835";
        student.group = "D";
        student.course = "Sistemas de Informação";

        data.add(peopleOne);
        data.add(student);

        People peopleTwo = new People();
        peopleTwo.name = "Laura";
        peopleTwo.lastName = "Palmer";
        peopleTwo.age = 17;

        boolean e = data.contains(peopleTwo);
        System.out.println(e);

        data.remove(student);
        System.out.println(data.contains(student));
    }
}
