package modulo02.aula27;

public class Car {
    public String brand;
    public String model;

    @Override
    public boolean equals(Object object) {
        Car car = (Car) object;
        if (this.brand.equals(car.brand) && this.model.equals(car.model)) {
            return true;
        }
        return false;
    }
}