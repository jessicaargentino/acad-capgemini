package modulo02.aula30;

public class FaultOne {
    public static void main(String[] args) {

        String nome = null; // NullPointerException
        int idade = Integer.parseInt("-10"); // NumberFormatException

        if (idade <= 0 || idade > 150) {
            throw new IllegalArgumentException("Idade inválida!"); // Lançamento de exceção
        }

    }
}
