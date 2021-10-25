package modulo02.aula30;

import java.util.Scanner;

/**
 * Código sobre pilha de erros, para demonstrar o uso básico do throws e
 * try-catch Código de Maykon D Granemann
 */
public class FaultTwo {
    public static void main(String[] args) {
        System.out.println("Entrando na main...");
        methodOne();
        System.out.println("Saindo na main...");
    }

    public static void methodOne() {
        System.out.println("Entrando no metodo 1...");
        methodTwo();
        System.out.println("Saindo do metodo 1...");
    }

    public static void methodTwo() {
        System.out.println("Entrando no metodo 2...");
        int age = 0;
        do {
            try {
                System.out.println("Digite sua age");
                Scanner input = new Scanner(System.in);
                age = Integer.parseInt(input.nextLine());

                if (age < 0 || age > 150) {
                    throw new IllegalArgumentException("age invalida! Deve ser maior que zero e menor que 150!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Dado inválido! Preencha novamente");
                age = -1;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage() + " Preencha novamente");
                age = -1;
            }

        } while (age == -1);
        System.out.println("Saindo do metodo 2...");
    }
}
