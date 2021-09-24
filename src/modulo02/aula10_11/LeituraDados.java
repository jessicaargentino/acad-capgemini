package modulo02.aula10_11;

import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        String linha = entrada.nextLine(); //Lê uma linha inteira, até encontrar uma quebra
        System.out.println("Foi lido : " + linha);

        String linha2 = entrada.next(); //Lê até o próximo espaço
        System.out.println("Foi lido 2 : " + linha2);

        String linha3 = entrada.nextLine();
        System.out.println("Foi lido 3 : " + linha3);

        int n1 = entrada.nextInt(); //Lê um número inteiro até o próximo espaço/enter
        System.out.println("Foi lido 4 : " + n1);

        int n2 = Integer.parseInt(entrada.nextLine()); //Lê uma linha linha e pega o conteúdo inteiro    
        System.out.println("Foi lido 5 : " + n2);

        double sal1 = Double.parseDouble(entrada.nextLine());
        float sal2 = Float.parseFloat(entrada.nextLine());
    }
}
