package modulo02.aula30;

public class FaultOne {
    public static void main(String[] args) {

        String name = null; // NullPointerException
        int age = Integer.parseInt("-10"); // NumberFormatException

        if (age <= 0 || age > 150) {
            throw new IllegalArgumentException("Idade inválida!"); // Lançamento de exceção
        }

    }
}
