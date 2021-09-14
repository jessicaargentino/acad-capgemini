package modulo01.aula04;

import java.util.Scanner;

public class CadastroClientes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = "", sobrenome = "";
        short idade;

        System.out.println("***** CADASTRO DE CLIENTES *****");
        System.out.print("Digite sua idade: ");
        idade = entrada.nextShort();
        entrada.nextLine();

        if (idade >= 18) {
            System.out.print("Digite seu nome: ");
            nome = entrada.nextLine();
            System.out.print("Digite seu sobrenome: ");
            sobrenome = entrada.nextLine();

            System.out.println("\nSeu cadastro foi realizado com sucesso!\n");
            System.out.println("***** FICHA DE CADASTRO *****");
            System.out.printf("Nome cliente: %s %s\n", nome, sobrenome);
            System.out.printf("Idade: %d anos", idade);
        } else {
            System.out.println("Menor de idade - Não foi possível realizar o cadastro!");
        }

        entrada.close();
    }
}
