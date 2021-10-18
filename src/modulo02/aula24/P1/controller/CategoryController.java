package modulo02.aula24.P1.controller;

import java.util.ArrayList;

import modulo02.aula24.P1.model.Category;

public class CategoryController {
    /** ArrayList de Category para armazenamento de objetos deste tipo */
    ArrayList<Category> category = new ArrayList<Category>();

    /**
     * Método que salva um objeto do tipo Category dentro do ArrayList de Category
     * 
     * @param c objeto do tipo Category
     */
    public void save(Category c) {
        category.add(c);
    }

    /** Método que retorna todos os objetos presentes no ArrayList */
    public ArrayList<Category> read() {
        return category;
    }
}
