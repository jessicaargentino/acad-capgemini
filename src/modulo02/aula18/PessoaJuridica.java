package modulo02.aula18;

/* CLASSE FILHA DE PESSOA */
public class PessoaJuridica extends Pessoa {
    /* DECLARAÇÃO DOS ATRIBUTOS DA CLASSE */
    private String nomeFantasia;
    private String inscricaoEstadual;
    private String cnpj;

    /* GETTERS E SETTERS */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
