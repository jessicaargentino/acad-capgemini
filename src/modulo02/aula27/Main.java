package modulo02.aula27;

public class Main {
    public static void main(String[] args) {
        /** Criação de três objetos da classe People, Car e Data */
        People people = new People();
        people.name = "Laura";
        people.lastName = "Palmer";

        Car car = new Car();
        car.brand = "General Motors";
        car.model = "Chevrolet Opala";

        Data data = new Data();

        /**
         * Sequência de verificações se o elemento existe, adição dos elementos no Array
         * para verificação da adição por parte do Array em posições diferentes,
         * verificação de tamanho e remoção de elementos
         */
        System.out.println(data.contains(car));
        System.out.println(data.add(people));
        System.out.println(data.contains(people));
        System.out.println(data.add(car));
        System.out.println(data.contains(people));
        System.out.println(data.contains(car));
        System.out.println(data.add(people));
        System.out.println(data.add(car));
        System.out.println(data.add(people));
        System.out.println(data.add(car));
        System.out.println(data.size());
        System.out.println(data.remove(car));
    }
}