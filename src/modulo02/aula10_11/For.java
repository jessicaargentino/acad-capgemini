package modulo02.aula10_11;

public class For {
    public static void main(String[] args) {

        for (int repeticoes = 1; repeticoes <= 5; repeticoes++) {
            System.out.printf("\nrepetição %d", repeticoes);
        }

        for (int linha = 1; linha <= 10; linha++) {
            System.out.printf("%d - ", linha);

            for (int colunas = 1; colunas <= 10; colunas++) {
                System.out.printf("%d ", colunas);
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {          
            System.out.println(i);
         }
   
         for(int i = 10; i > 0; i--){
            System.out.println(i);
         }  
         
         for (int i = 0; i < 10; i++) {
            System.out.println("Jéssica");
         }

    }
}
