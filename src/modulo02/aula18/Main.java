package modulo02.aula18;

public class Main {
    public static void main(String[] args) {
        /* CRIANDO UMA INSTÂNCIA DA CLASSE PESSOAFISICA (OBJETO) */
        PessoaFisica pf = new PessoaFisica();

        /* UTILIZANDO OS MÉTODOS HERDADPS DA CLASSE PAI */
        pf.setNome("Laura Palmer");

        /* IMPRESSÃO DO NOME */
        System.out.println(pf.getNome());

    }

}
