package modulo02.aula23;

public class StringsMain {
    public static void main(String[] args) {
        String name = "Inês";
        String nameTwo = "inês";

        /**
         * Conversão temporária dos dois nomes em maiúsculo para provar que ele compara
         * os objetos e não o conteúdo propriamente dito
         */
        boolean equals = name.toUpperCase().equals(nameTwo.toUpperCase());

        System.out.println(equals);
        System.out.println(name);
        System.out.println(nameTwo);

    }
}
