package modulo02.aula21.aula21_camadas.view;

import java.util.Scanner;

import modulo02.aula21.aula21_camadas.model.Pessoa;
import modulo02.aula21.aula21_camadas.repository.PessoaRepository;

public class TelaPrincipal {
    public static void main(String[] args) {
        /*
         * CRIANDO UMA INSTÂNCIA DA CLASSE PESSOAREPOSITORY (OBJETO)
         */
        PessoaRepository pr = new PessoaRepository();
        Scanner entrada = new Scanner(System.in);

        /*
         * UTILIZAÇÃO DO FOR PARA ENTRADA DE DADOS DE DUAS PESSOAS. APÓS A LEITURA, OS
         * ATRIBUTOS SÃO ARMAZENADOS EM UM OBJETO PESSOA
         */
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o id da pessoa: ");
            int id = Integer.parseInt(entrada.nextLine());

            System.out.print("Digite o nome da pessoa: ");
            String nome = entrada.nextLine();

            System.out.print("Digite o sobrenome da pessoa: ");
            String sobrenome = entrada.nextLine();
            System.out.println();

            Pessoa p1 = new Pessoa(id);
            p1.setNome(nome);
            p1.setSobrenome(sobrenome);
            pr.create(p1); // MÉTODO CREATE DA CLASSE PESSOAREPOSITORY, QUE CRIA UM OBJETO PESSOA NO ARRAYLIST
        }

        /*
         * FOR PARA PERCORRER O ARRAYLIST DE LEITURA UTILIZANDO O MÉTODO READ E FAZER A
         * IMPRESSÃO
         */
        for (Pessoa p : pr.read()) {
            System.out.println(p);
        }

        entrada.close();
    }
}
