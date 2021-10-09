package modulo02.aula21.aula21_camadas.model;

/* CLASSE MODELO FILHA DE BASE */
public class Pessoa extends Base {
    private String nome;
    private String sobrenome;

    /* HERANÇA DO CONSTRUTOR DA CLASSE MÃE */
    public Pessoa(int id) {
        super(id);
    }

    /* GETTERS E SETTERS */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    /*
     * SOBREESCRITA DO TOSTRING DA CLASSE OBJECT PARA IMPRESSÃO DO NOME E SOBRENOME
     */
    @Override
    public String toString() {
        return this.getId() + "-" + this.nome + " - " + this.sobrenome;
    }
}