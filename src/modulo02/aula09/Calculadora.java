package modulo02.aula09;

import java.util.Scanner;

public class Calculadora {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double numero1, numero2;

        imprimeCabecalho();

        numero1 = lerNumero("\nDigite o 1º número: ");
        numero2 = lerNumero("Digite o 2º número: ");

        numero2 = validaEntrada(numero2);
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

    static void imprimeCabecalhoOperacoes() {
        System.out.println("\n****** RESULTADO DAS OPERAÇÕES ******");
    }

    static double validaEntrada(double num2) {
        System.out.println();
        do {
            System.out.print("O divisor não pode ser igual a 0, digite o 2º número novamente: ");
            num2 = Double.parseDouble(entrada.nextLine());
        } while (num2 == 0.0);
        return num2;
    }

    static double adicao(double num1, double num2) {
        double adicao = (num1 + num2);
        return adicao;
    }

    static double subtracao(double num1, double num2) {
        double subtracao = (num1 - num2);
        return subtracao;
    }

    static double multiplicacao(double num1, double num2) {
        double multiplicacao = (num1 * num2);
        return multiplicacao;
    }

    static double divisao(double num1, double num2) {
        double divisao = (num1 / num2);
        return divisao;
    }

    static void imprimeResultado(double num1, double num2) {
        System.out.printf("Adição: %.1f\n", adicao(num1, num2));
        System.out.printf("Subtração: %.1f\n", subtracao(num1, num2));
        System.out.printf("Multiplicação: %.1f\n", multiplicacao(num1, num2));
        System.out.printf("Divisão: %.1f\n", divisao(num1, num2));
    }
}
