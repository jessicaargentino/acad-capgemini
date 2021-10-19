package modulo02.aula26.a02;

public class Main {
    public static void main(String[] args) {
        Object object = new Object();

        People peopleOne = new People();
        peopleOne.name = "Pessoa 01";

        IndividualPerson individualPerson = new IndividualPerson();
        individualPerson.name = "Pessoa Fisica 1";
        individualPerson.cpf = "1563156315";

        People peopleTwo = individualPerson;
        Object objectTwo = individualPerson;

        imprimir(object);
        imprimir(peopleOne);
        imprimir(peopleTwo);

        int addition = 10 + 10;
        String name = "Laura" + " Palmer";
    }

    /**
     * Método que imprime o toString de um objeto
     * 
     * @param obj objeto de uma classe
     */
    public static void imprimir(Object obj) {
        System.out.println(obj.toString());
    }
}
