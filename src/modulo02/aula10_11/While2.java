package modulo02.aula10_11;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        byte idade = Byte.parseByte(entrada.nextLine());

        while(idade < 0){
            System.out.println("Idade nao pode ser negativa!\nDigite novamente: ");
            idade = Byte.parseByte(entrada.nextLine());
        }

        System.out.println("========== Obrigado ===========");
    }
}
