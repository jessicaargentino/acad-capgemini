package modulo02.aula15;

public class Escola {
    public static void main(String[] args) {
        // CRIANDO UMA INSTÂNCIA DA CLASSE BOLETIM(OBJETO) E DECLARAÇÃO DE VARIÁVEL PARA
        // ARMAZENAR MÉDIA
        Boletim boletim = new Boletim();
        double media3;

        // CHAMADA DOS MÉTODOS DE SALVAR A MÉDIA DOS VALORES INFORMADOS E IMPRIMIR O
        // BOLETIM
        boletim.salvarMedia(1, 5.4, 8.1, 0.9);
        boletim.salvarMedia(3, 7.6, 3.2, 2.5);
        boletim.imprimirBoletim();

        // VARIÁVEL MEDIA3 RECEBE A MÉDIA DAS NOTAS DO INFORMADAS NO BIMESTRE 3
        media3 = boletim.mediaBimestre(3);

        // REALIZA A IMPRESSÃO DA MÉDIA
        System.out.println(media3);
    }
}
