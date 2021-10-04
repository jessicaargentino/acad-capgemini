package modulo02.aula17;

public class ArrayString {
    public static void main(String[] args) {
        /* ARRAY DE STRINGS COM 5 COMPONENTES */
        String nome[] = new String[5];

        /* IMPRESSÃO DE TESTE PARA VER QUE O DEFAULT DE STRING É NULL */
        System.out.println(nome[0]);

        /* ATRIBUIÇÃO DE VALORES PARA AS POSIÇÕES DO ARRAY */
        nome[0] = "Laura Palmer";
        nome[1] = "R2D2";
        nome[2] = "Norman Bates";
        nome[3] = "Chiriro";
        nome[4] = "Kaonashi";

        /* PERCORRENDO OS VALORES COM O FOR E OS IMPRIMINDO */
        for (int n = 0; n < nome.length; n++) {
            System.out.println(nome[n]);
        }

        /* PERCORRENDO OS VALORES COM O FOREACH E OS IMPRIMINDO */
        for (String nomes : nome) {
            System.out.println(nomes);
        }
    }
}
