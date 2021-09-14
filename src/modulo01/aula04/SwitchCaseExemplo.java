package modulo01.aula04;

import java.util.Scanner;

public class SwitchCaseExemplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        System.out.println("***** CADASTRO DE CLIENTES *****");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("0 - Sair");
        System.out.print("Opção escolhida: ");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Cadastrar clientes");
                break;
            case 2:
                System.out.println("Listar clientes");
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        entrada.close();
    }
}
