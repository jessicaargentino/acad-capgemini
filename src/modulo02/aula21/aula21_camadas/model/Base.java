package modulo02.aula21.aula21_camadas.model;

/* CLASSE ABSTRATA/PAI DE MODELO PARA OBTENÇÃO DE ID PELA CLASSE FILHA PESSOA */
public abstract class Base {
    /* DEFINIÇÃO DO ATRIBUTO */
    private int id;

    /* CONSTRUTOR */
    public Base(int id) {
        this.id = id;
    }

    /* GETTER */
    public int getId() {
        return id;
    }
}
