package modulo01.aula07;

import java.util.Scanner;

public class CadastroNomeFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome, sobrenome;

        System.out.println("***** CADASTRO DE NOMES *****");
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = entrada.nextLine();

        System.out.println("\n***** IMPRESSÃO DO NOME x10 *****");
        for (int n = 0; n < 10; n++) {
            System.out.printf("Nome completo: %s %s\n", nome, sobrenome);
        }
        entrada.close();
    }
}
