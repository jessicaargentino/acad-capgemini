package modulo02.aula30;

import java.util.ArrayList;

public class FaultThree {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        System.out.println(numbers[6]);

        ArrayList<String> names = new ArrayList<String>();
        names.add("Maykon");
        names.add("Jojo");
        names.add("Ines");
        System.out.println(names.get(5)); // ArrayIndexOutOfBoundsException
    }
}
