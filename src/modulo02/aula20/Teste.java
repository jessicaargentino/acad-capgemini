package modulo02.aula20;

public class Teste {
    public static void main(String[] args) {
        /*
         * CRIANDO UMA INSTÂNCIA DA CLASSE PESSOA (OBJETO)
         */
        Pessoa pessoa = new Pessoa();

        /* ATRIBUIÇÃO DE NOME UTILIZANDO O SETTER */
        pessoa.setNome("Laura Palmer");

        /* CHAMADA DO MÉTODO TOSTRING DA CLASSE OBJECT SOBREESCRITO */
        System.out.println(pessoa.toString());

    }
}
