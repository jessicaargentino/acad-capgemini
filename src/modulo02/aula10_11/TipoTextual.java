package modulo02.aula10_11;

public class TipoTextual {
    public static void main(String[] args){
        // Tipagem estática = a variável possui apenas um tipo, não muda de tipo durante a execução
        String nome1 = "Jéssica";
        String msg = "11a5sd1a5sd 1a5ds1a2d5asd";
        char l1 = 'b';
        char l2 = 'a';
        char lq = 74;

        System.out.println(lq);

        // Conversão explicita de dados
        String m1 = Character.toString(l1) + Character.toString(l2);
    } 
}
