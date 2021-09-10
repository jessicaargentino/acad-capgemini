package modulo01.aula01;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome, sobrenome;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = entrada.nextLine();

        System.out.println("O nome e o sobrenome digitados foi: " + nome + " " + sobrenome);

        entrada.close();
    }
}
