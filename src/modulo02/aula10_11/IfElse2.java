package modulo02.aula10_11;

public class IfElse2 {
    public static void main(String[] args) {
        byte idade = 19;

        if(idade >= 17 ){
            System.out.println("De maior");
        }
        else{
            System.out.println("De menor");
        }

        if(idade > 18){
            System.out.println("passou da idade");
        }
        else if(idade == 18)
        {
            System.out.println("alistamento");
        }
        else{
            System.out.println("abaixo da idade");
        }

    } 
}
