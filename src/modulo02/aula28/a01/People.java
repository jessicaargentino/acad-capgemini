package modulo02.aula28.a01;

public class People {
    public String name;
    public String lastName;
    public byte age;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof People) {
            People people = (People) obj;
            if (this.name.equals(people.name) && this.lastName.equals(people.lastName) && this.age == people.age) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + ";" + this.lastName + ";" + this.age;
    }
}
