package modulo01.aula07;

public class PrimoPar {
    public static void main(String[] args) {
        int par = 100, primo = 150;

        System.out.println("***** IMPRESSÃO DE PARES ATÉ 100 *****");
        for (int n = 0; n < par; n++) {
            if (n % 2 == 0) {
                System.out.printf("%d ", n);
            }
        }
        System.out.println("\n\n***** IMPRESSÃO DE PRIMOS ATÉ 150 *****");
        for (int n = 2; n <= primo; n++) {
            if (verificaPrimo(n)) {
                System.out.printf("%d ", n);
            }
        }
    }

    public static boolean verificaPrimo(int numero) {
        boolean ehprimo = true;

        for (int n = 2; n < numero; n++) {
            if (numero % n == 0) {
                ehprimo = false;
            }
        }
        return ehprimo;
    }
}
