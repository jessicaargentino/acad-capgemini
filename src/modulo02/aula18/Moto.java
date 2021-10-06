package modulo02.aula18;

/* CLASSE FILHA */
public class Moto extends Veiculo {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private String cilindradas;
    private String bau;

    /* GETTERS E SETTERS */
    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setBau(String bau) {
        this.bau = bau;
    }

    public String getBau() {
        return bau;
    }

}
