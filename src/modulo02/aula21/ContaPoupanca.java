package modulo02.aula21;

public class ContaPoupanca extends Conta {
    /* A CLASSE FILHA/SUBCLASSE SEMPRE HERDA O CONSTRUTOR DA SUPERCLASSE/PAI */
    public ContaPoupanca(String codigoCliente) {
        super(0, codigoCliente);
    }
}
