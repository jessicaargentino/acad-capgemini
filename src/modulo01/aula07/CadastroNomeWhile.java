package modulo01.aula07;

import java.util.Scanner;

public class CadastroNomeWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome, sobrenome;
        int contador = 0;

        System.out.println("***** CADASTRO DE NOMES *****");
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = entrada.nextLine();

        System.out.println("\n***** IMPRESSÃO DO NOME x10 *****");
        while(contador < 10){
            System.out.printf("Nome completo: %s %s\n", nome, sobrenome);
            contador++;
        }
        entrada.close();
    }
}
