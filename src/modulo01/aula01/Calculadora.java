package modulo01.aula01;

import java.util.Scanner;

public class Calculadora {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, somaNumeros = 0;

        System.out.print("Digite o 1º número: ");
        num1 = entrada.nextInt();

        System.out.print("Digite o 2º número: ");
        num2 = entrada.nextInt();

        somaNumeros = (num1 + num2);

        System.out.println("O resultado da soma é: " + somaNumeros);

        entrada.close();
    }
}
