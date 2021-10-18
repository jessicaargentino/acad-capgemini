package modulo02.aula24.P1.view;

import java.util.Scanner;

public class ViewMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /**
         * Recebe uma opção escolhida pelo usuário, se for 1, instancia a classe
         * ProductView e chama o método execute, se for 2, instancia a classe
         * CategortView e chama o método execute.
         */
        System.out.print("Escolha uma opção:");
        int option = Integer.parseInt(input.nextLine());

        switch (option) {
            case 1:
                ProductView p = new ProductView();
                p.execute();
                break;
            case 2:
                CategoryView c = new CategoryView();
                c.execute();
                break;
        }
        input.close();
    }
}