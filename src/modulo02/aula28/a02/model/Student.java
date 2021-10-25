package modulo02.aula28.a02.model;

public class Student extends People {
    public String registration;
    public String group;
    public String course;

    @Override
    public String toString() {
        return super.toString() + ";" + this.registration + ";" + this.group + ";" + this.course;
    }
}
