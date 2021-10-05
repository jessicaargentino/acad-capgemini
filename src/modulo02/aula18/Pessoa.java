package modulo02.aula18;

import java.util.Date;

/* CLASSE PAI */
public class Pessoa {
    /* DECLARAÇÃO DOS ATRIBUTOS DA CLASSE */
    private int codigo;
    private String nome;
    private Date dataNascimento;

    /* GETTERS E SETTERS */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

}
