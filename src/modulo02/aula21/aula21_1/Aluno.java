package modulo02.aula21.aula21_1;

public class Aluno {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private int codigo;
    private String nome;
    private int idade;

    /* CONSTRUTOR */
    public Aluno(int codigo) {
        this.codigo = codigo;
    }

    /* GETTERS E SETTERS */
    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}