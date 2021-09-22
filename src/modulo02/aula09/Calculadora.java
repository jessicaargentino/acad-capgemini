package modulo02.aula09;

import java.util.Scanner;

public class Calculadora {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double numero1, numero2;

        imprimeCabecalho();

        numero1 = lerNumero("\nDigite o 1º número: ");
        numero2 = lerNumero("Digite o 2º número: ");

        if (!validaEntrada(numero2)) {
            numero2 = Double.parseDouble(entrada.nextLine());
        }

        imprimeCabecalhoOperacoes();
        imprimeResultado(numero1, numero2);
    }

    static void imprimeCabecalho() {
        System.out.println("****** CALCULADORA ******");
    }

    static double lerNumero(String mensagem) {
        System.out.print(mensagem);
        double numero = Double.parseDouble(entrada.nextLine());
        return numero;
    }

    static boolean validaEntrada(double num2) {
        boolean ehValido = true;
        if (num2 == 0.0) {
            System.out.print("\nO divisor não pode ser igual a 0, digite o 2º número novamente: ");
            ehValido = false;
        }
        return ehValido;
    }

    static void imprimeCabecalhoOperacoes() {
        System.out.println("\n****** RESULTADO DAS OPERAÇÕES ******");
    }

    static double adicao(double num1, double num2) {
        return (num1 + num2);
    }

    static double subtracao(double num1, double num2) {
        return (num1 - num2);
    }

    static double multiplicacao(double num1, double num2) {
        return (num1 * num2);
    }

    static double divisao(double num1, double num2) {
        return (num1 / num2);
    }

    static void imprimeResultado(double num1, double num2) {
        System.out.printf("Adição: %.1f\n", adicao(num1, num2));
        System.out.printf("Subtração: %.1f\n", subtracao(num1, num2));
        System.out.printf("Multiplicação: %.1f\n", multiplicacao(num1, num2));
        System.out.printf("Divisão: %.1f\n", divisao(num1, num2));
    }
}
