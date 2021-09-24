package modulo02.aula10_11;

public class TipoInteiro {
    public static void main(String[] args) {
        // Byte = 8bits 0-255 - 11111111     
        byte min = Byte.MIN_VALUE;
        byte max = Byte.MAX_VALUE;

        // Short 2Bytes - 16bits - 0-65535 - 1111111111111111
        short minS = Short.MIN_VALUE;
        short maxS = Short.MAX_VALUE;

        // Int 4Bytes - 32bits - 0-4294967296 - 11111111111111111111111111111111
        int minI = Integer.MIN_VALUE;
        int maxI = Integer.MAX_VALUE;

        // Long 8Bytes - 64bits - 0-65535 - 1111111111111111111111111111111111111111111111111111111111111111
        long minL = Long.MIN_VALUE;
        long maxL = Long.MAX_VALUE;

        System.out.println(minL);
        System.out.println(maxL);


        // long n1 = minI; == conversao implicita 
        // explicitas - cast
        // byte n2 = (byte)minL; // nao converte corretamente == 0
        // long n3 = (long) "Jéssica"; /// nao funciona!
        // System.out.println(n2);
    }
}
