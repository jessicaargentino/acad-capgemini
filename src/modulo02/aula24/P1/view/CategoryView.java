package modulo02.aula24.P1.view;

import modulo02.aula24.P1.controller.CategoryController;
import modulo02.aula24.P1.model.Category;

public class CategoryView {
    /**
     * Método que instancia a classe CategoryController para salvar e imprimir os
     * objetos de Category presentes no ArrayList e instancia também a classe
     * Category para criar um objeto e setar valores para seus atributos
     */
    public void execute() {
        CategoryController controller = new CategoryController();

        Category category = new Category();
        category.name = "Tvs";
        category.description = "Tvs até 32";

        controller.save(category);

        for (Category c : controller.read()) {
            System.out.println(c.name);
            System.out.println(c.description);
        }
    }
}
