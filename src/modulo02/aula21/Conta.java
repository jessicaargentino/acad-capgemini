package modulo02.aula21;

/* CLASSE PAI ABSTRATA, SOMENTE MODELO PARA AS OUTRAS */
public abstract class Conta {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private double saldo;
    private String codigoCliente;

    /* CONSTRUTOR */
    public Conta(double saldo, String codigoCliente) {
        this.saldo = saldo;
        this.codigoCliente = codigoCliente;
    }

    /* GETTERS */
    public double getSaldo() {
        return saldo;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    /*
     * MÉTODO QUE RECEBE UM VALOR POR PARÂMETRO E REALIZA O SAQUE, O DIMINUINDO DO
     * SALDO
     */
    public void saque(double valor) {
        this.saldo -= valor;
    }

    /*
     * MÉTODO QUE RECEBE UM VALOR POR PARÂMETRO E REALIZA O DEPÓSITO, O
     * ACRESCENTANDO AO SALDO
     */
    public void deposito(double valor) {
        this.saldo += valor;
    }

    /* SOBREESCRITA DO TOSTRING DA CLASSE OBJECT */
    @Override
    public String toString() {
        return this.saldo + ", " + this.codigoCliente;
    }
}
