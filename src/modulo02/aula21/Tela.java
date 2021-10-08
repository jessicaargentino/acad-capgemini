package modulo02.aula21;

public class Tela {
    public static void main(String[] args) {
        /*
         * CRIANDO UMA INSTÂNCIA DA CLASSE CONTAPOUPANÇA E CONTACORRENTE (OBJETOS),
         * CHAMADA DO MÉTODO DEPÓSITO E IMPRESSÃO DO SALDO
         */
        ContaPoupanca conta = new ContaPoupanca("cp9898-9");
        conta.deposito(150.00);
        System.out.println(conta.getSaldo());

        ContaCorrente cc = new ContaCorrente(150.60, "cp9898-9");
        System.out.println(cc.getSaldo());

        /* IMPRESSÃO DO TOSTRING */
        System.out.println(conta);
        System.out.println(cc);
    }
}
