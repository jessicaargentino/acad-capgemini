package modulo02.aula20;

public class PessoaConstrutor {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private String nome;
    private String sobrenome;
    private int idade;

    /* CONSTRUTOR DA CLASSE */
    public PessoaConstrutor(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    /* GETTERS E SETTERS */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }
}
