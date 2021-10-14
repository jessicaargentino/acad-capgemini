package modulo02.aula23;

public class Film {
    public String title;
    public int releaseYear;
    public String genre;

    /**
     * Reescrita do método equals, que compara se a posição de um objeto na memória
     * é igual a posição do outro, para comparar também se os atributos são iguais
     */
    @Override
    public boolean equals(Object obj) {
        Film other = (Film) obj;

        if (this.title == other.title && this.releaseYear == other.releaseYear && this.genre == other.genre) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return this.title + ";" + this.releaseYear + ";" + this.genre;
    }
}
