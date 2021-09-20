package modulo01.aula05;

import java.util.Scanner;

public class CadastroCliente {
    public static String nome, sobrenome, rg, cpf;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("***** CADASTRO DE CLIENTES *****");
            System.out.println("\nOlá! Seja bem vindo(a) ao cadastro de clientes!\n");
            System.out.println("Escolha sua opção: ");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar cliente");
            System.out.println("3 - Sair");
            System.out.print("Opção escolhida: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    listarCliente();
                    break;
                case 3:
                    System.out.println("\nObrigada por utilizar nosso cadastro!");
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente!\n");
                    break;
            }
        } while (opcao != 3);
    }

    public static void cadastrarCliente() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n***** CADASTRO DE CLIENTES *****");
        do {
            System.out.print("Digite seu nome: ");
            nome = entrada.nextLine();
        } while (validaNome(nome) == false);

        do {
            System.out.print("Digite seu sobrenome: ");
            sobrenome = entrada.nextLine();
        } while (validaSobrenome(sobrenome) == false);

        do {
            System.out.print("Digite seu RG: ");
            rg = entrada.nextLine();
        } while (validaRg(rg) == false);

        do {
            System.out.print("Digite seu CPF: ");
            cpf = entrada.nextLine();
        } while (validaCpf(cpf) == false);

        System.out.printf("\n%s, seu cadastro foi realizado com sucesso!\n\n", nome);
    }

    public static boolean validaNome(String nome) {
        boolean valida = true;

        if (nome.length() < 3) {
            System.out.println("O nome deve conter no mínimo 3 caracteres, tente novamente!");
            valida = false;
        } else {
            valida = true;
        }
        return valida;
    }

    public static boolean validaSobrenome(String sobrenome) {
        boolean valida = true;

        if (sobrenome.length() < 3) {
            System.out.println("O sobrenome deve conter no mínimo 3 caracteres, tente novamente!");
            valida = false;
        } else {
            valida = true;
        }
        return valida;
    }

    public static boolean validaRg(String rg) {
        boolean valida = true;

        if (rg.length() < 4) {
            System.out.println("O RG deve conter no mínimo 4 caracteres, tente novamente!");
            valida = false;
        } else {
            valida = true;
        }
        return valida;
    }

    public static boolean validaCpf(String cpf) {
        boolean valida = true;

        if (cpf.length() < 11) {
            System.out.println("O CPF deve conter no mínimo 11 caracteres, tente novamente!");
            valida = false;
        } else {
            valida = true;
        }
        return valida;
    }

    public static void listarCliente() {

        System.out.println("\n***** FICHA DE CADASTRO *****");
        System.out.printf("Nome cliente: %s %s\n", nome, sobrenome);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println();
    }

}
