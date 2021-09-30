package modulo02.aula14;

public class Banco {
    public static void main(String[] args) {
        // CRIANDO UMA INSTÂNCIA DA CLASSE CONTA-CORRENTE(OBJETO)
        ContaCorrente cc1 = new ContaCorrente();

        // IMPRESSÃO DO SALDO INICIAL E REALIZAÇÃO DE DEPÓSITO
        System.out.println(cc1.saldo());
        cc1.depositar(1000);

        // IMPRESSÃO DO SALDO ATUALIZADO E REALIZAÇÃO DE SAQUE
        System.out.println(cc1.saldo());
        cc1.sacar(50);

        // IMPRESSÃO DO SALDO ATUALIZADO
        System.out.println(cc1.saldo());
    }
}
