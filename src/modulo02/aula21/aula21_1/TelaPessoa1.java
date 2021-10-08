package modulo02.aula21.aula21_1;

public class TelaPessoa1 {
    public static void main(String[] args) {
        /*
         * CRIANDO TRÊS INSTÂNCIAS DA CLASSE PESSOA (OBJETOS) E ATRIBUINDO NOMES
         * UTILIZANDO OS SETTERS
         */
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNomeCompleto("Laura Palmer");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNomeCompleto("Pure Vessel");

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNomeCompleto("Luke Skywalker");

        /* CRIANDO UM ARRAY DE PESSOAS E ATRIBUINDO OS OBJETOS CRIADOS A ELE */
        Pessoa[] pessoa = new Pessoa[3];
        pessoa[0] = pessoa1;
        pessoa[1] = pessoa2;
        pessoa[2] = pessoa3;
        
        /* PERCORRENDO O ARRAY E IMPRIMINDO A PESSOA */
        for (int i = 0; i < pessoa.length; i++) {
            System.out.printf("\nImprindo pessoa %d: %s", i, pessoa[i].getNomeCompleto());
        }
    }
}
