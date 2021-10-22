package modulo02.aula28.a01;

public class Student extends People {
    public String registration;
    public String group;
    public String course;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;

            if (this.registration.equals(student.registration) && this.group.equals(student.group)
                    && this.course.equals(this.course) && super.equals(student)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        String retorno = super.toString() + ";" + this.registration + ";" + this.group + ";" + this.course;
        return retorno;
    }
}
