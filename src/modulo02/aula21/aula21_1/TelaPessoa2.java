package modulo02.aula21.aula21_1;

import java.util.ArrayList;

public class TelaPessoa2 {
    public static void main(String[] args) {
        /*
         * CRIANDO TRÊS INSTÂNCIAS DA CLASSE PESSOA (OBJETOS) E ATRIBUINDO NOMES
         * UTILIZANDO OS SETTERS
         */
        Pessoa p1 = new Pessoa();
        p1.setNomeCompleto("Inês Brasil");

        Pessoa p2 = new Pessoa();
        p2.setNomeCompleto("Joelma Calypso");

        Pessoa p3 = new Pessoa();
        p3.setNomeCompleto("Michael Douglas");

        /*
         * CRIANDO UM ARRAYLIST DE PESSOAS E ADICIONANDO OS OBJETOS A ELE
         */
        ArrayList<Pessoa> ap = new ArrayList<Pessoa>();
        ap.add(p1);
        ap.add(p2);
        ap.add(p3);
        ap.remove(p2); /* REMOVENDO UM OBJETO */

        /* PERCORRENDO O ARRAYLIST DE PESSOAS E IMPRIMINDO OS NOMES */
        for (Pessoa p : ap) {
            System.out.println(p.getNomeCompleto());
        }

    }
}
