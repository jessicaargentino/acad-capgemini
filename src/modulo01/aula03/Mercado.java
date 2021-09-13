package modulo01.aula03;

import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int quantidade;

        System.out.println("********** MERCADO **********");
        System.out.print("Digite seu nome: ");
        nome = entrada.next();
        System.out.printf("Olá, %s! Seja bem vindo(a) ao Mercado!\n\n", nome);
        System.out.print("Quantos produtos serão cadastrados? ");
        quantidade = entrada.nextInt();
        System.out.println();
        cadastrarProduto(quantidade);
    }

    public static void cadastrarProduto(int quantidade) {
        Scanner entrada = new Scanner(System.in);
        String nome, descricao, categoria;
        double valor;

        for (int n = 0; n < quantidade; n++) {
            System.out.printf("Digite o nome do %dº produto: ", n + 1);
            nome = entrada.next();
            System.out.printf("Digite a descrição do %dº produto: ", n + 1);
            descricao = entrada.next();
            System.out.printf("Digite a categoria do %dº produto: ", n + 1);
            categoria = entrada.next();
            System.out.printf("Digite o valor do %dº produto: R$", n + 1);
            valor = entrada.nextDouble();

            validarCadastro(nome, descricao, categoria, valor);
        }
    }

    public static void validarCadastro(String nome, String descricao, String categoria, double valor) {
        System.out.printf("\nO produto %s de descrição %s, categoria %s e valor R$%.2f foi cadastrado com sucesso!\n\n",
                nome, descricao, categoria, valor);
    }
}
