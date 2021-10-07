package modulo02.aula20;

public class TestePConstrutor {
    public static void main(String[] args) {
        /*
         * CRIANDO UMA INSTÂNCIA DA CLASSE PESSOACONSTRUTOR (OBJETO), PASSANDO
         * PARÂMETROS PARA O CONSTRUTOR
         */
        PessoaConstrutor pessoa = new PessoaConstrutor("Laura", "Palmer", 17);

        /* ATRIBUIÇÃO DOS VALORES DOS ATRIBUTOS A VARIÁVEIS */
        String nome = pessoa.getNome();
        String sobrenome = pessoa.getSobrenome();
        int idade = pessoa.getIdade();

        /* IMPRESSÃO DOS ATRIBUTOS */
        System.out.printf("%s %s - %d anos", nome, sobrenome, idade);
    }
}
