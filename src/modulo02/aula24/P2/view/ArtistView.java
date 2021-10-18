package modulo02.aula24.P2.view;

import java.util.ArrayList;
import java.util.Scanner;

import modulo02.aula24.P2.controller.ArtistController;
import modulo02.aula24.P2.model.Artist;

public class ArtistView {
    public static void main(String[] args) {
        ArtistController controller = new ArtistController();
        Scanner input = new Scanner(System.in);
        int option;

        /**
         * Executa o menu e as chamadas da opção escolhida pelo usuário enquanto a mesma
         * for diferente de 0
         */
        do {
            option = menu(input);
            switch (option) {
                case 1:
                    save(controller, input);
                    break;
                case 2:
                    read(controller);
                    break;
            }
        } while (option != 0);
    }

    /**
     * Método que imprime as informações dos objetos presentes no ArrayList de
     * Artist
     * 
     * @param controller objeto da classe ArtistController
     */
    private static void read(ArtistController controller) {
        ArrayList<Artist> list = controller.read();
        for (Artist artist : list) {
            System.out.printf("\nNome: %s, Categoria: %s, Nacionalidade: %s\n", artist.name, artist.category,
                    artist.nationality);
        }
    }

    /**
     * Método que cria um objeto da classe Artist e salva no ArrayList de Artist
     * Artist
     * 
     * @param controller objeto da classe ArtistController
     * @param input      objeto Scanner para entrada de dados do usuário
     */
    private static void save(ArtistController controller, Scanner input) {
        Artist a = new Artist();
        System.out.print("\nNome: ");
        a.name = input.nextLine();
        System.out.print("Categoria: ");
        a.category = input.nextLine();
        System.out.print("Digite a nacionalidade: ");
        a.nationality = input.nextLine();
        controller.save(a);
    }

    /**
     * Método que imprime as opções do menu, recebe a opção escolhida pelo usuário e
     * a retorna
     * 
     * @param input objeto Scanner para entrada de dados do usuário
     * @return opção escolhida pelo usuário
     */
    private static int menu(Scanner input) {
        System.out.print("\n1 - Cadastrar\n2 - Listar\n0 - Sair\nEscolha uma opção: ");
        int option = Integer.parseInt(input.nextLine());
        return option;
    }
}
