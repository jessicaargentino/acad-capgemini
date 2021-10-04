package modulo02.aula17;

public class Main {
    public static void main(String[] args) {
        // CRIANDO UMA INSTÂNCIA DA CLASSE PESSOA(OBJETO)
        Pessoa pessoa = new Pessoa();

        // CHAMADA DOS SETTERS PARA ATRIBUIR OS VALORES, ATRIBUIÇÃO DOS VALORES
        // RETORNADOS PELOS GETTERS NAS VARIÁVEIS E IMPRESSÃO DOS MESMOS
        pessoa.setNome("Jéssica");
        String nome = pessoa.getNome();
        System.out.println(nome);

        pessoa.setSobrenome("Argentino");
        String sobrenome = pessoa.getSobrenome();
        System.out.println(sobrenome);

        pessoa.setIdade(22);
        int idade = pessoa.getIdade();
        System.out.println(idade);

        pessoa.setCpf("000.000.000-00");
        String cpf = pessoa.getCpf();
        System.out.println(cpf);
    }
}