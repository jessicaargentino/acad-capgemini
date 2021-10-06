package modulo02.aula18;

public class Main {
    public static void main(String[] args) {
        /*
         * CRIANDO UMA INSTÂNCIA DA CLASSE PESSOAFISICA, CARIOPSE, MOTO E CARRO
         * (OBJETOS)
         */
        PessoaFisica pf = new PessoaFisica();
        Cariopse cariopse = new Cariopse();
        Moto moto = new Moto();
        Carro carro = new Carro();

        /* UTILIZANDO OS MÉTODOS HERDADOS DA CLASSE PAI */
        pf.setNome("Laura Palmer");
        cariopse.setFolha("Folhas longas");
        moto.setCor("Preta");
        carro.setFabricante("Volvo");

        /* IMPRESSÃO DOS ATRIBUTOS */
        System.out.println(pf.getNome());
        System.out.println(cariopse.getFolha());
        System.out.println(moto.getCor());
        System.out.println(carro.getFabricante());

    }

}
