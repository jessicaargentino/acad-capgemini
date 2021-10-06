package modulo02.aula19;

public class Teste {
    public static void main(String[] args) {
        /*
         * CRIANDO UMA INSTÂNCIA DA CLASSE GARRAFA E GARRAFATERMICA (OBJETOS)
         */
        Garrafa garrafa = new Garrafa();
        GarrafaTermica garrafaTermica = new GarrafaTermica();

        /* CHAMADA DAS FUNÇÕES PARA MOSTRAR A SOBRESCRITA */
        garrafa.funcao();
        garrafaTermica.funcao();
    }
}
