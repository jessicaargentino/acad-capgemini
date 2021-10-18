package modulo02.aula24.P1.controller;

import java.util.ArrayList;

import modulo02.aula24.P1.model.Product;

public class ProductController {
    /** ArrayList de Product para armazenamento de objetos deste tipo */
    private ArrayList<Product> product = new ArrayList<Product>();

    /**
     * Método que salva um objeto do tipo Product dentro do ArrayList de Product
     * 
     * @param c objeto do tipo Product
     */
    public void save(Product p) {
        this.product.add(p);
    }

    /** Método que retorna todos os objetos presentes no ArrayList */
    public ArrayList<Product> read() {
        return product;
    }

}
