package modulo02.aula10_11;

public class SwitchCase{
    public static void main(String[] args) {
        int opcao = 5;

        switch (opcao) {
            case 1:
                System.out.println("Igual a 1");
                break;
            case 2:
                System.out.println("Igual a 2");
                break;  
            case 3:
                System.out.println("Igual a 3");
                break;
            default:
                System.out.println("Opcao nao prevista");
        }
    }
}