package modulo02.aula24.P1.view;

import java.util.ArrayList;

import modulo02.aula24.P1.controller.ProductController;
import modulo02.aula24.P1.model.Product;

public class ProductView {
    /**
     * Método que instância a classe Product criando o objeto p, passando por
     * construtor um produto e valor, e chama o método set para setar uma marca.
     * Após isso, instancia a classe ProductController para utilizar o método save e
     * read para salvar e imprimir os objetos do ArrayList de Products.
     */
    public void execute() {
        Product p = new Product("Tv", 1999.99);

        p.setBrand("Samsung");

        ProductController controller = new ProductController();
        controller.save(p);
        ArrayList<Product> product = controller.read();

        for (Product pr : product) {
            System.out.println(pr);
        }

    }
}
