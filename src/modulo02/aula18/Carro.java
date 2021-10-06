package modulo02.aula18;

/* CLASSE FILHA */
public class Carro extends Veiculo {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private int porta;
    private boolean arCondicionado;

    /* GETTERS E SETTERS */
    public void setPorta(int porta) {
        this.porta = porta;
    }

    public int getPorta() {
        return porta;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean getArCondicionado() {
        return arCondicionado;
    }

}
