package modulo02.aula10_11;

import java.util.Scanner;

public class DoWhile{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        byte idade = 0;
        boolean invalido = false;
        do{
            System.out.print("Digite sua idade: ");
            idade = Byte.parseByte(entrada.nextLine());
            if(idade < 0){
                System.out.println("Idade nao pode ser negativa!");
                invalido =true;
            }
        }while(invalido);

        System.out.println("========== Obrigado ===========");
    }
}