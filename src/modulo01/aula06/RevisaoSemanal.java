package modulo01.aula06;

import java.util.Scanner;

public class RevisaoSemanal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = "", sobrenome = "";
        byte idade = 0;
        double altura = 0;
        int num = 10, contador = 0;
        boolean dado_valido = true;

        //byte, short, long, float, double = 0.0
        //if else if else

        while (contador < 10) {
            System.out.println(contador);
            //contador = contador + 1;
            //contador += 1;
            contador++;
        }

        System.out.println(contador);

        //%s == String
        //%d == valores inteiros (int, byte, short, long)
        //%f == pontos flutuantes (float, double)

        System.out.printf("O nome é %s, o sobrenome %s e a idade %d e altura %.2f",
                nome, sobrenome, idade, altura);

        //EXEMPLO DO-WHILE
        do {
            System.out.println("Digite seu nome: ");
            nome = entrada.nextLine();

            if (nome.length() < 3) {
                System.out.println("Xoven, digitastes erado");
                dado_valido = false;
            }

        //EXEMPLO WHILE
        } while (!dado_valido);
        entrada.close();

        //EXEMPLO FOR
        for (int cont = 0; cont < 10; cont++) {
            System.out.println(cont);
        }
    }
}
