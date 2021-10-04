package modulo02.aula17;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* CRIANDO UM ARRAY DE OBJETOS CATEGORIA */
        Categoria[] categoria = new Categoria[2];

        /* UTILIZAÇÃO DO FOR PARA ENTRADA DE DADOS */
        for (int i = 0; i < categoria.length; i++) {
            /* INSTÂNCIA DA CLASSE CATEGORIA A CADA ITERAÇÃO */
            Categoria categorias = new Categoria();

            /* SET DOS VALORES */
            System.out.printf("Digite o nome da categoria %d: ", i);
            categorias.setNome(entrada.nextLine());
            System.out.printf("Digite a descrição da categoria %d: ", i);
            categorias.setDescricao(entrada.nextLine());
            System.out.println();

            /* ATRIBUIÇÃO DO OBJETO CATEGORIA A POSIÇÃO I DO ARRAY CATEGORIA */
            categoria[i] = categorias;
        }

        /* IMPRESSÃO UTILIZANDO O FOREACH */
        for (Categoria c : categoria) {
            System.out.printf("Nome: %s | Descrição: %s\n", c.getNome(), c.getDescricao());
        }

        entrada.close();

    }

}
