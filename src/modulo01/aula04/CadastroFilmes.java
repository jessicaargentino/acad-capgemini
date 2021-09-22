package modulo01.aula04;

import java.util.Scanner;

public class CadastroFilmes {
    static Scanner entrada = new Scanner(System.in);
    static String nome;
    static int anoLancamento;

    public static void main(String[] args) {
        int opcao;

        exibeCabecalho();
        exibeMenu();
        opcao = escolheOpcao();

        switch (opcao) {
            case 1:
                cadastraFilme();
                break;
            case 2:
                cadastraSerie();
                break;
            case 3:
                cadastraDocumentario();
                break;
            case 0:
                System.out.println("\nObrigada por utilizar nosso cadastro!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    static void exibeCabecalho() {
        System.out.println("***** CADASTRO DE AUDIOVISUAIS *****");
        System.out.println("\nOlá! Seja bem vindo(a) ao cadastro, selecione sua opção:\n");
    }

    static void exibeMenu() {
        System.out.println("1 - Cadastrar filme");
        System.out.println("2 - Cadastrar série");
        System.out.println("3 - Cadastrar documentário");
        System.out.println("0 - Sair");
    }

    static int escolheOpcao() {
        int opcao;

        System.out.print("Opção selecionada: ");
        opcao = entrada.nextInt();
        entrada.nextLine();
        return opcao;
    }

    static void cadastraFilme() {
        String descricao, genero;

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
    }

    static void cadastraSerie() {
        String produtora;

        System.out.println("\n***** CADASTRO DE SÉRIES *****");
        System.out.print("Nome: ");
        nome = entrada.nextLine();
        System.out.print("Produtora: ");
        produtora = entrada.nextLine();
        System.out.print("Ano de lançamento: ");
        anoLancamento = entrada.nextInt();

        System.out.printf("\nA série %s foi cadastrada com sucesso!\n", nome);
    }

    static void cadastraDocumentario() {
        String tema;

        System.out.println("\n***** CADASTRO DE DOCUMENTÁRIOS *****");
        System.out.print("Nome: ");
        nome = entrada.nextLine();
        System.out.print("Tema: ");
        tema = entrada.nextLine();
        System.out.print("Ano de lançamento: ");
        anoLancamento = entrada.nextInt();

        System.out.printf("\nO documentário %s foi cadastrado com sucesso!\n", nome);
    }
}
