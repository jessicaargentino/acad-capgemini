package modulo01.aula05;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean invalido = true;
        String nome;

        do {
            System.out.print("Digite o nome do produto: ");
            nome = entrada.nextLine();
            if (nome.length() < 5) {
                System.out.println("O nome deve ter mais de 5 caracteres, tente novamente!");
            } else {
                System.out.println("\nNome digitado: " + nome);
                invalido = false;
            }
        } while (invalido);

        entrada.close();
    }
}
