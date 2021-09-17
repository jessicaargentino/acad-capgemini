package modulo01.aula06;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = "", sobrenome = "";

        System.out.println("***** CADASTRO DE USUÁRIOS *****");
        for (int n = 0; n < 4; n++) {
            System.out.printf("\nDigite o nome do %dº usuário: ", n + 1);
            nome = entrada.nextLine();
            System.out.printf("Digite o sobrenome do %dº usuário: ", n + 1, "\n");
            sobrenome = entrada.nextLine();
        }
        System.out.printf("\n%s %s foi o último usuário cadastrado!\n", nome, sobrenome);
        entrada.close();
    }
}
