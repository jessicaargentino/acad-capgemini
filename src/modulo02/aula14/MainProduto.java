package modulo02.aula14;

public class MainProduto {
    public static void main(String[] args) {
        int numero = -10;

        // CRIANDO UMA INSTÂNCIA DA CLASSE PRODUTO(OBJETO)
        Produto produto1 = new Produto();
        produto1.nome = "TV";
        produto1.descricao = "TV da Xuxa";
        produto1.valor = 99.90;

        Produto produto2 = new Produto();
        produto2.nome = "Smartphone";
        produto2.descricao = "Telefone caro";
        produto2.valor = 13999.98;
        
        // IMPRESSÃO DO NÚMEROE DOS VALORES ARMAZENADOS NO ATRIBUTO NOME DE CADA
        // INSTÂNCIA
        System.out.println(numero);
        System.out.println(produto1.nome);
        System.out.println(produto2.nome);
    }
}
