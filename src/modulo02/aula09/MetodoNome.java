package modulo02.aula09;

public class MetodoNome {
    public static void main(String[] args) {
        /* chamada do método imprimeNome passando dois argumentos do tipo String */
        imprimeNome("Jéssica", "Argentino");

        String nomeCompleto = retornaNomeCompleto("Jéssica", "Argentino", "Dias");
        double taxa = converteTaxaJuros(2);

        System.out.println(nomeCompleto);
        System.out.println(taxa);
    }

    /* imprimeNome - recebe dois parâmetros String e retorna (imprime) void */
    static void imprimeNome(String nome, String sobrenome) {
        System.out.printf("%s %s\n", nome, sobrenome);
    }

    static String retornaNomeCompleto(String nome, String sobrenome, String ultimoNome) {
        String nomeCompleto = nome + " " + sobrenome + " " + ultimoNome;
        return nomeCompleto;
    }

    static double converteTaxaJuros(int jurosInt) {
        double jurosDouble = jurosInt;
        double percentual = (jurosDouble / 100);
        return percentual;
    }
}
