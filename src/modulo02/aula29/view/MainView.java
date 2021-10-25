package modulo02.aula29.view;

import modulo02.aula29.model.Adress;
import modulo02.aula29.model.IndividualPerson;

public class MainView {
    public static void main(String[] args) {
        IndividualPerson individualPerson = new IndividualPerson();
        individualPerson.id = 10;
        individualPerson.name = "Laura Palmer";

        Adress adress = new Adress();
        adress.adress = "Rua Bernice";
        adress.number = "294";
        adress.complement = "Apto 202";
        adress.zipCode = "88987-555";
        adress.city = "Twin Peaks";
        adress.state = "Washington";
        individualPerson.homeAdress = adress;

        individualPerson.businessAdress = adress;

        System.out.println(individualPerson.homeAdress.adress);
        System.out.println(individualPerson.businessAdress.adress);

        System.out.println("***** ALTERAÇÕES *****");
        adress.adress = "Rua Bolinho";

        System.out.println(individualPerson.homeAdress.adress);
        System.out.println(individualPerson.businessAdress.adress);

        adress = new Adress();
        System.out.println(adress.adress);
        System.out.println(individualPerson.homeAdress.adress);
        System.out.println(individualPerson.businessAdress.adress);

    }
}
