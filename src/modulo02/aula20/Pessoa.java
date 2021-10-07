package modulo02.aula20;

public class Pessoa {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private String nome;

    /* GETTER E SETTER */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    /* SOOBRESCRITA DO MÉTODO TOSTRING DA CLASSE INTERNA OBJECT */
    @Override
    public String toString() {
        String mensagem = "Classe pessoa - " + getNome();
        return mensagem;
    }
}
