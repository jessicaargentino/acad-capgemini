package modulo02.aula28.a02.controller;

import java.util.ArrayList;

/**
 * BaseController com CRUD utilizando o conceito de Generics, que consiste na
 * criação de uma classe genérica com suas funcionalidades que pode ser
 * estendida para n classes de tipos diferentes, através da herança. O T
 * representa Type, que será substituido pelo tipo da classe que você irá
 * estender.
 */
public class BaseController<T> {
    private ArrayList<T> data;

    public BaseController() {
        this.data = new ArrayList<T>();
    }

    public int size() {
        return data.size();
    }

    public void create(T obj) {
        this.data.add(obj);
    }

    public ArrayList<T> read() {
        return this.data;
    }

    public void update(T obj) {
        if (contains(obj)) {
            this.delete(obj);
            this.create(obj);
        }
    }

    public void delete(T obj) {
        this.data.remove(obj);
    }

    public boolean contains(T obj) {
        return this.data.contains(obj);
    }
}
