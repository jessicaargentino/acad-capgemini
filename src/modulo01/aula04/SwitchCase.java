package modulo01.aula04;

public class SwitchCase {
    public static void main(String[] args) {
        int idade = 15;
        String nome = "Rengar";

        switch (nome) {
            case "Jésica":
                System.out.println("Valor 1");
                break;
            case "Argentino":
                System.out.println("Valor 5");
                break;
            case "Dias":
                System.out.println("Valor 10");
                break;
            default:
                System.out.printf("Valor default: %s", nome);
                break;
        }
    }
}
