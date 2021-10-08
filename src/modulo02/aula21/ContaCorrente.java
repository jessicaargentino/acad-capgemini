package modulo02.aula21;

/* CLASSE FILHA */
public class ContaCorrente extends Conta {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private double taxa = 2.5;

    /* A CLASSE FILHA/SUBCLASSE SEMPRE HERDA O CONSTRUTOR DA SUPERCLASSE/PAI */
    public ContaCorrente(double saldo, String codigoCliente) {
        super(saldo, codigoCliente);
    }

    /* SOBREESCRITA DO TOSTRING DA CLASSE CONTA */
    @Override
    public String toString() {
        return super.toString() + ", " + this.taxa;
    }
}
