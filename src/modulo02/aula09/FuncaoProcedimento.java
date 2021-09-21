package modulo02.aula09;

import java.util.Scanner;

public class FuncaoProcedimento {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        cabecalho();
        imprimeMenu();
        escolheOpcao();
    }

    static void cabecalho() {
        System.out.println("****** CALCULADORA ******");
    }

    static void imprimeMenu() {
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Sair");
    }

    static void escolheOpcao() {
        int opcao, numero1 = 0, numero2 = 0, resultado;

        opcao = lerNumero("Escolha uma opção: ");

        if (opcao >= 1 && opcao <= 5) {
            numero1 = lerNumero("\nDigite o 1º número: ");
            numero2 = lerNumero("Digite o 2º número: ");
        }

        switch (opcao) {
            case 1:
                resultado = adicao(numero1, numero2);
                System.out.printf("\nO resultado da adição de %d + %d é: %d", numero1, numero2, resultado);
                break;
            case 2:
                resultado = subtracao(numero1, numero2);
                System.out.printf("\nO resultado da subtração de %d - %d é: %d", numero1, numero2, resultado);
                break;
            case 3:
                resultado = multiplicacao(numero1, numero2);
                System.out.printf("\nO resultado da multiplicação de %d * %d é: %d", numero1, numero2, resultado);
                break;
            case 4:
                resultado = divisao(numero1, numero2);
                System.out.printf("\nO resultado da divisão de %d / %d é: %d", numero1, numero2, resultado);
                break;
            case 5:
                System.out.println("\nObrigada por utilizar a calculadora!\n");
                break;
            default:
                System.out.println("\nOpção inválida!\n");
                break;
        }
    }

    static int lerNumero(String mensagem) {
        System.out.print(mensagem);
        int numero = Integer.parseInt(entrada.nextLine());
        return numero;
    }

    static int adicao(int num1, int num2) {
        int adicao = (num1 + num2);
        return adicao;
    }

    static int subtracao(int num1, int num2) {
        int subtracao = (num1 - num2);
        return subtracao;
    }

    static int multiplicacao(int num1, int num2) {
        int multiplicacao = (num1 * num2);
        return multiplicacao;
    }

    static int divisao(int num1, int num2) {
        int divisao = (num1 / num2);
        return divisao;
    }
}
