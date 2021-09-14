package modulo01.aula04;

import java.util.Scanner;

public class CadastroFilmes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao, anoLancamento;
        String nome, descricao, genero, produtora, tema;

        System.out.println("***** CADASTRO DE AUDIOVISUAIS *****");
        System.out.println("\nOlá! Seja bem vindo(a) ao cadastro, selecione sua opção:\n");
        System.out.println("1 - Cadastrar filme");
        System.out.println("2 - Cadastrar série");
        System.out.println("3 - Cadastrar documentário");
        System.out.println("0 - Sair");
        System.out.print("Opção selecionada: ");
        opcao = entrada.nextInt();

        entrada.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("\n***** CADASTRO DE FILMES *****");
                System.out.print("Nome: ");
                nome = entrada.nextLine();
                System.out.print("Descrição: ");
                descricao = entrada.nextLine();
                System.out.print("Gênero: ");
                genero = entrada.nextLine();
                System.out.print("Ano de lançamento: ");
                anoLancamento = entrada.nextInt();

                System.out.printf("\nO filme %s foi cadastrado com sucesso!\n", nome);
                break;
            case 2:
                System.out.println("\n***** CADASTRO DE SÉRIES *****");
                System.out.print("Nome: ");
                nome = entrada.nextLine();
                System.out.print("Produtora: ");
                produtora = entrada.nextLine();
                System.out.print("Ano de lançamento: ");
                anoLancamento = entrada.nextInt();

                System.out.printf("\nA série %s foi cadastrada com sucesso!\n", nome);
                break;
            case 3:
                System.out.println("\n***** CADASTRO DE DOCUMENTÁRIOS *****");
                System.out.print("Nome: ");
                nome = entrada.nextLine();
                System.out.print("Tema: ");
                tema = entrada.nextLine();
                System.out.print("Ano de lançamento: ");
                anoLancamento = entrada.nextInt();

                System.out.printf("\nO documentário %s foi cadastrado com sucesso!\n", nome);
                break;
            case 0:
                System.out.println("\nObrigada por utilizar nosso cadastro!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        entrada.close();
    }
}
