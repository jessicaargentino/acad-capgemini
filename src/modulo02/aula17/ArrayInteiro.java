package modulo02.aula17;

public class ArrayInteiro {
    public static void main(String[] args) {
        /* DECLARAÇÃO DE VARIÁVEIS */
        int idade1 = 10, idade2 = 20, idade3 = 30, idade4 = 40, idade5 = 50;

        /* ARRAY DE INTEIROS COM 5 COMPONENTES, RECEBENDO AS IDADES DECLARADAS */
        int idade[] = new int[5];
        idade[0] = idade1;
        idade[1] = idade2;
        idade[2] = idade3;
        idade[3] = idade4;
        idade[4] = idade5;

        /* IMPRESSÃO DOS VALORES DO ARRAY */
        System.out.println(idade[0]);
        System.out.println(idade[1]);
        System.out.println(idade[2]);
        System.out.println(idade[3]);
        System.out.println(idade[4]);
    }

}
