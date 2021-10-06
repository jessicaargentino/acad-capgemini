package modulo02.aula19;

public class TesteConta {
    public static void main(String[] args) {
        /*
         * CRIANDO UMA INSTÂNCIA DA CLASSE CONTA E CONTACORRENTE (OBJETOS)
         */
        Conta conta = new Conta();
        ContaCorrente cc = new ContaCorrente();

        /*
         * ATRIBUIÇÃO DE VALOR UTILIZANDO O SETTER E CHAMADA DO MÉTODO DE TRANSFERÊNCIA
         * DE AMBAS AS CLASSES
         */
        conta.setSaldo(1000.00);
        conta.transferencia(15);
        cc.setSaldo(500);
        cc.transferencia(60);

        /* IMPRESSÃO DO SALDO ATUAL */
        System.out.printf("Saldo após a transferência: R$%.2f", conta.getSaldo());
        System.out.printf("\nSaldo CC após a transferência: R$%.2f", cc.getSaldo());

    }

}
