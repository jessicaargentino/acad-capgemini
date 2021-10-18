package modulo02.aula24.P1.model;

public class Product {
    private String name;
    private double value;
    private String brand;

    public Product(String name, double value) {
        this.name = name;
        this.value = value;
    }

    /** Setter */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return this.name + "," + this.value + "," + this.brand;
    }
}
