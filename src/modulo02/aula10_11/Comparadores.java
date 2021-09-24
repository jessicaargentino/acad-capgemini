package modulo02.aula10_11;

public class Comparadores {
    public static void main(String[] args) {        
        byte idade = 17;
        
        if(idade >= 18){
            System.out.println("Pode consumir drogas");
        }
        if(idade > 18 || idade == 18){
            System.out.println("Pode consumir drogas");
        }
        if(idade < 18){
            System.out.println("Pode consumir coca");
        }
    }
}
