package modulo02.aula14;

public class ContaCorrente {
    // ATRIBUTO DA CLASSE
    private double saldo;

    // MÉTODO PARA RECEBER UM VALOR E ACRESCENTÁ-LO Á VARIÁVEL SALDO
    public void depositar(double valor) {
        saldo += valor;
    }

    // MÉTODO PARA RECEBER UM VALOR E DECREMENTÁ-LO Á VARIÁVEL SALDO
    public double sacar(double valor) {
        saldo -= valor;
        return valor;
    }

    // MÉTODO PARA RETORNAR O SALDO
    public double saldo() {
        return saldo;
    }
}
