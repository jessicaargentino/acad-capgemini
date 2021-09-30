package modulo02.aula14;

public class MainCalculadora {
    public static void main(String[] args) {

        // CRIANDO UMA INSTÂNCIA DA CLASSE CALCULADORA(OBJETO)
        Calculadora calculadora = new Calculadora();

        // CHAMADA DOS MÉTODOS DA CLASSE E ARMAZENAMENTO DOS RETORNOS EM VARIÁVEIS
        int soma = calculadora.soma(5, 2);
        int subtracao = calculadora.subtracao(5, 2);
        int multiplicacao = calculadora.multiplicacao(5, 2);
        int divisao = calculadora.divisao(5, 2);

    }

}
