package modulo02.aula26.a02;

public class IndividualPerson extends People {
    public String cpf;

    @Override
    public String toString() {
        return this.name + " " + this.cpf;
    }
}
