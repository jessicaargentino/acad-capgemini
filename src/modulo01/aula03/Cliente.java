package modulo01.aula03;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        short idade;

        System.out.println("********** CADASTRO DE CLIENTES **********\n");
        System.out.println("\tBem vindo, digite as informações do cliente!");
        System.out.printf("\tDigite o nome do cliente: ");
        nome = entrada.next();
        System.out.printf("\tDigite a idade do cliente: ");
        idade = entrada.nextShort();

        System.out.printf("\tO cliente %s de idade %d foi cadastrado com sucesso!\n", nome, idade);
        entrada.close();
    }
}
