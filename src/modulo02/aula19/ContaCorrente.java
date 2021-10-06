package modulo02.aula19;

public class ContaCorrente extends Conta {
    /* DECLARAÇÃO DOS ATRIBUTOS */
    private double taxaTransferencia = 10.0;

    /*
     * MÉTODO QUE SOBRESCREVE A TRANSFERÊNCIA DA CLASSE PAI, ADICIONANDO UMA TAXA
     * QUE SERÁ DEBITADA DO SALDO PÓS TRANSFERÊNCIA
     */
    @Override
    public void transferencia(double valorTransferencia) {
        super.transferencia(valorTransferencia);
        double saldoAtual = this.getSaldo();
        this.setSaldo(saldoAtual - taxaTransferencia);
    }
}
