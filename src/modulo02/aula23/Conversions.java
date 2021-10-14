package modulo02.aula23;

public class Conversions {
    public static void main(String[] args) {
        /**
         * Conversão explicítia de int em long devido ao tamanho do int. Depois
         * conversão "forçada" utilizando o cast responsavelmente por saber que o
         * conteúdo do long era um int
         */
        int n = 10;
        long nLong = n;
        int n2 = (int) nLong;

        /** Criação de um objeto através da instância da classe Film */
        Film film = new Film();
        film.title = "Star Wars - The Empire Strikes Back";
        film.releaseYear = 1980;
        film.genre = "Ficção científica";

        /**
         * Conversao de um objeto da classe Object em filme, o que gerará um erro pois
         * Object nunca foi um Film anteriormente. Já a conversão de um Film em Object
         * dará certo, pois a classe Film é filha indiretamente de Object, e uma classe
         * filha sempre pode ser convertida na mãe, mas a mãe não pode ser convertida na
         * filha
         */
        Object obj = film;
        Object object = new Object();
        Film filmeTwo = (Film) object;

        System.out.println(film);
        System.out.println(filmeTwo);

    }
}
