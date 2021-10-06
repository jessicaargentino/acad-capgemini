package modulo02.aula18;

import java.util.Date;

/* CLASSE PAI */
public class Veiculo {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private String fabricante;
    private String modelo;
    private Date ano;
    private String cor;
    private String placa;

    /* GETTERS E SETTERS */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public Date getAno() {
        return ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }
}
