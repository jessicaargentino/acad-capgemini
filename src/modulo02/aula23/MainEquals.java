package modulo02.aula23;

public class MainEquals {
    public static void main(String[] args) {

        Film filmOne = new Film();
        filmOne.title = "Star Wars - The Empire Strikes Back";
        filmOne.releaseYear = 1980;
        filmOne.genre = "Ficção científica";

        Film filmTwo = new Film();
        filmTwo.title = "Star Wars - The Empire Strikes Back";
        filmTwo.releaseYear = 1980;
        filmTwo.genre = "Ficção científica";

        /** Método equals sobreescrito */
        boolean equals = filmTwo.equals(filmTwo);
        System.out.println(equals);

        Film filmThree = new Film();
        filmThree.title = "Poderoso chefao";
        filmThree.releaseYear = 1999;
        filmThree.genre = "Crime";

        Film filmeFour = filmThree;
        filmThree.title = "Titanic";

        System.out.println(filmThree.title);
        System.out.println(filmeFour.title);
        /**
         * Método equals chamado após o apontamento de filmThree para filmFour, o que os
         * coloca/aponta para o mesmo espaço de memória e consequentemente retorna true
         * no equals (que compara o objeto)
         */
        boolean equal = filmThree.equals(filmeFour);
        System.out.println(equal);
    }
}
