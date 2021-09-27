package modulo02.aula10_11;

import java.util.Scanner;

public class DoWhile2{
    public static void main(String[] args) {        
        Scanner entrada = new Scanner(System.in);
        byte opcao;
        char continua = 'N';
        
        do{
            System.out.println("\n****** CADASTRO DE PRODUTOS ******");
            System.out.println("1 - Cadastro de produto");
            System.out.println("2 - Cadastro de categoria");
            System.out.println("3 - Cadastro de fornecedores");
            System.out.print("Digite uma opção: ");
            opcao = Byte.parseByte(entrada.nextLine()); 

            switch(opcao){
                case 1:
                    System.out.println("\nProduto");
                break;
                case 2:
                    System.out.println("\nCategoria");
                break;
                case 3:
                    System.out.println("\nFornecedores");
                break;
                default:
                    System.out.println("\nO número digitado não esta entre as opções previstas");
                break; 
                        
            }

            if(opcao > 0 && opcao < 4 ){
                do{
                    System.out.print("\nPara voltar digite V e para sair digite S: ");
                    continua = entrada.nextLine().toUpperCase().charAt(0);    
                }while(continua !='V' && continua !='S');
            }

        }while(opcao < 1 || opcao > 3 || continua == 'V');

        entrada.close();
    }
}