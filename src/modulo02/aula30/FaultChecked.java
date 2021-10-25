package modulo02.aula30;

import java.io.File;
import java.io.IOException;

public class FaultChecked {
    public static void main(String[] args) {
        File archive = new File("teste.txt");
        try {
            archive.createNewFile();
        } catch (IOException e) {
            System.out.println("Não foi possível criar o arquivo!");
        }
    }
}
