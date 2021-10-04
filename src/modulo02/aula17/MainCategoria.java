package modulo02.aula17;

public class MainCategoria {
    public static void main(String[] args) {
        /* CRIANDO UM ARRAY DE OBJETOS CATEGORIA */
        Categoria[] categoria = new Categoria[2];

        /* CRIANDO UMA INSTÂNCIA DA CLASSE CATEGORIA (OBJETO) */
        Categoria instrumento = new Categoria();
        Categoria comida = new Categoria();

        /* ATRIBUIÇÃO DE VALORES UTILIZANDO O SETTER */
        instrumento.setNome("Kalimba");
        instrumento.setDescricao("Instrumento musical");
        comida.setNome("Cheesecake de morango");
        comida.setDescricao("Torta de cream cheese e morango");

        /* GUARDANDO OS OBJETOS INSTRUMENTO E COMIDA NA 1ª E 2ª POSIÇÃO DO ARRAY DE OBJETOS CATEGORIA */
        categoria[0] = instrumento;
        categoria[1] = comida;

        /* IMPRESSÃO UTILIZANDO O FOREACH */
        for (Categoria categorias : categoria) {
            System.out.printf("Nome: %s | Descrição: %s\n", categorias.getNome(), categorias.getDescricao());
        }
    }
}
