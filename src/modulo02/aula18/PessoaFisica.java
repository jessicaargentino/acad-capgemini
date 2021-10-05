package modulo02.aula18;

/* CLASSE FILHA DE PESSOA */
public class PessoaFisica extends Pessoa {
    /* DECLARAÇÃO DOS ATRIBUTOS DA CLASSE */
    private String rg;
    private String cpf;

    /* GETTERS E SETTERS */
    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
