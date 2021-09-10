package modulo01.aula02;

public class TipoFloat {
    public static void main(String[] args) {
        float menor_valor = Float.MIN_VALUE; //1.4E-45 (32 bits)
        float maior_valor = Float.MAX_VALUE; //3.4028235E38 (32 bits)

        //PARA ATRIBUIR UM VALOR PARA UMA VARIÁVEL FLOAT É NECESSÁRIO UTILIZAR O 'F' NO FINAL DO VALOR
        float salario = 800.00f;
        float massa = 5.972E24f; //MASSA DA TERRA

        System.out.println(menor_valor);
        System.out.println(maior_valor);
        System.out.println(salario);
        System.out.println(massa);

    }
}
