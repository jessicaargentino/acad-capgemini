package modulo02.aula20;

public class TelaCalculadora {
    public static void main(String[] args) {
        /*
         * CRIANDO UMA INSTÂNCIA DA CLASSE CALCULADORA (OBJETO)
         */
        Calculadora c = new Calculadora();

        /* ARMAZENANDO OS RETORNOS DOS MÉTODOS DE SOMA NAS VARIÁVEIS */
        double r1 = c.soma(10, 20);
        double r2 = c.soma(10, 20, 30);
        double r3 = c.soma(10.0, 20.9);
        String r4 = c.soma("10", "20", "30");
        
        /* IMPRESSÃO DA CONCATENAÇÃO DE STRINGS */
        System.out.println(r4);
    }
}
