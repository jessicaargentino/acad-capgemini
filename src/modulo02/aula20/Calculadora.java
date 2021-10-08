package modulo02.aula20;

public class Calculadora {
    /* MÉTODO QUE RECEBE DOIS DOUBLES E REALIZA A SOMA DOS MESMOS */
    public double soma(double v1, double v2) {
        System.out.println("Soma com 2 doubles");
        return v1 + v2;
    }

    /* MÉTODO QUE RECEBE TRÊS DOUBLES E REALIZA A SOMA DOS MESMOS */
    public double soma(double v1, double v2, double v3) {
        System.out.println("Soma com 3");
        return v1 + v2 + v3;
    }

    /* MÉTODO QUE RECEBE DOIS INTS E REALIZA A SOMA DOS MESMOS */
    public double soma(int v1, int v2) {
        System.out.println("Soma com 2 ints");
        return v1 + v2;
    }

    /* MÉTODO QUE RECEBE DUAS STRINGS E REALIZA A SOMA DAS MESMAS */
    public double soma(String v1, String v2) {
        System.out.println("Soma com 2 Strings");
        return Double.parseDouble(v1) + Double.parseDouble(v2);
    }

    /* MÉTODO QUE RECEBE TRÊS STRINGS E CONCATENA AS MESMAS */
    public String soma(String v1, String v2, String v3) {
        System.out.println("Soma com 2 Strings com return String");
        return v1 + v2 + v3;
    }

}
