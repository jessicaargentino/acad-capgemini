package modulo01.aula02;

public class TipoDouble {
    public static void main(String[] args) {
        double menor_valor = Double.MIN_VALUE; //4.9E-324 (64 bits)
        double maior_valor = Double.MAX_VALUE; //1.7976931348623157E308 (64 bits)

        double salario = 800.00;

        System.out.println(menor_valor);
        System.out.println(maior_valor);
        System.out.println(salario);

    }
}
