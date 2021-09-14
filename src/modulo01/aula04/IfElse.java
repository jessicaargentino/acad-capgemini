package modulo01.aula04;

public class IfElse {
    public static void main(String[] args) {
        boolean verdade = true; // 1 - COM SINAL/PULSO ELÉTRICO
        boolean falso = false; // O - SEM SINAL/PULSO ELÉTRICO
        int n1 = 5, n2 = 5;

        if (n1 > n2) {
            System.out.println("Maior");
        } else if (n1 < n2) {
            System.out.println("Menor");
        } else {
            System.out.println("Igual");
        }
    }
}
