package modulo02.aula10_11;

public class While {
    public static void main(String[] args) {
        
        int repeticoes = 1;
        while(repeticoes <= 5){            
            System.out.printf("\nrepetição %d", repeticoes);
            repeticoes = repeticoes + 1;
        }
        repeticoes = 1;
        while(repeticoes <= 5){            
            System.out.printf("\nrepetição %d", repeticoes);
            repeticoes += 1;
        }
        repeticoes = 1;
        while(repeticoes <= 5){            
            System.out.printf("\nrepetição %d", repeticoes);
            repeticoes ++;
        }
    }
}
