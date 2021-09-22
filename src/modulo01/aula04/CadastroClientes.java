package modulo01.aula04;

import java.util.Scanner;

public class CadastroClientes {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        short idade;

        System.out.println("***** CADASTRO DE CLIENTES *****");
        System.out.println("Olá! Seja bem vindo(a) ao cadastro de clientes!\n");
        System.out.print("Digite sua idade: ");
        idade = entrada.nextShort();
        entrada.nextLine();

        cadastraCliente(idade);
    }

    static void cadastraCliente(int idade) {
        String nome, sobrenome;

        if (idade >= 18) {
            System.out.print("Digite seu nome: ");
            nome = entrada.nextLine();
            System.out.print("Digite seu sobrenome: ");
            sobrenome = entrada.nextLine();

            System.out.println("\nSeu cadastro foi realizado com sucesso!\n");
            exibeCadastro(nome, sobrenome, idade);
        } else {
            System.out.println("Menor de idade - Não foi possível realizar o cadastro!");
        }
    }

    static void exibeCadastro(String nome, String sobrenome, int idade) {
        System.out.println("***** FICHA DE CADASTRO *****");
        System.out.printf("Nome cliente: %s %s\n", nome, sobrenome);
        System.out.printf("Idade: %d anos", idade);
    }
}
