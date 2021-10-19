package modulo02.aula26.a01;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.name = "Prod1";
        product.description = "Prod1 desc";
        product.value = 1000.00;

        Appliance appliance = new Appliance();
        appliance.name = "Eletro1";
        appliance.description = "Eletro1 desc";
        appliance.value = 2000.00;
        appliance.voltage = "220v";

        /**
         * Apontamento do objeto productOne para o mesmo espaço de memória do objeto
         * appliance
         */
        Product productOne = appliance;
        imprimir(appliance);
    }

    /**
     * Método que recebe um objeto, verifica se é uma instância da classe Appliance
     * ou Product e imprime os atributos de acordo com a instância.
     * 
     * @param obj objeto de uma classe
     */
    public static void imprimir(Object obj) {
        if (obj instanceof Appliance) {
            System.out.println("É um eletrodomestico");
            Appliance a = (Appliance) obj;
            System.out.println(a.name);
            System.out.println(a.description);
            System.out.println(a.value);
            System.out.println(a.voltage);
        } else if (obj instanceof Product) {
            System.out.println("É um produto");
            Product p = (Product) obj;
            System.out.println(p.name);
            System.out.println(p.description);
            System.out.println(p.value);
        }
    }
}
