package modulo01.aula07;

public class RetornoInvestimento {
    public static void main(String[] args) {
        double investimento = 5000.00, retornoMensal = 0.0;
        System.out.println("***** INVESTIMENTO 24 MESES *****\n");
        System.out.printf("Valor inicial: R$%.2f\n", investimento);
        System.out.println("Investimento: 2%\n");
        for (int n = 0; n < 24; n++) {
            retornoMensal += investimento + (investimento * 0.02);
            System.out.printf("Retorno %dº mês: R$%.0f\n", n + 1, retornoMensal);
        }
    }
}
