package modulo02.aula14;

public class Calculadora {
    // DEFINIÇÃO DO ATRIBUTO DA CLASSE
    int numero1;

    // MÉTODO QUE RECEBE DOIS NÚMEROS INTEIROS E RETORNA O RESULTADO DA SOMA DOS
    // MESMOS
    int soma(int numero1, int numero2) {
        int soma = (numero1 + numero2);
        return soma;
    }

    // MÉTODO QUE RECEBE DOIS NÚMEROS INTEIROS E RETORNA O RESULTADO DA SUBTRAÇÃO
    // DOS MESMOS
    int subtracao(int numero1, int numero2) {
        int subtracao = (numero1 - numero2);
        return subtracao;
    }

    // MÉTODO QUE RECEBE DOIS NÚMEROS INTEIROS E RETORNA O RESULTADO DA
    // MULTIPLICAÇÃO DOS MESMOS
    int multiplicacao(int numero1, int numero2) {
        int multiplicacao = (numero1 * numero2);
        return multiplicacao;
    }

    // MÉTODO QUE RECEBE DOIS NÚMEROS INTEIROS E RETORNA O RESULTADO DA DIVISÃO DOS
    // MESMOS
    int divisao(int numero1, int numero2) {
        int divisao = (numero1 / numero2);
        return divisao;
    }

}
