package modulo02.aula28.a02.model;

public class People {
    public int id;
    public String name;
    public String lastName;
    public byte age;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof People) {
            People people = (People) obj;
            if (this.id == people.id) {
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
