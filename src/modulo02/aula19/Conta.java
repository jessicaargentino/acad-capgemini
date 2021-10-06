package modulo02.aula19;

/* CONTA PAI */
public class Conta {
    /* DECLARAÇÃO DOS ATRIBUTOS */
    private double saldo;

    /*
     * MÉTODO QUE RECEBE UM VALOR, REDUZ O VALOR DO SALDO E IMPRIME O VALOR QUE SERÁ
     * TRANSFERIDO
     */
    public void transferencia(double valorTransferencia) {
        saldo -= valorTransferencia;
        System.out.printf("Transferindo R$%.2f\n", valorTransferencia);
    }

    /* GETTER E SETTER */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

}
