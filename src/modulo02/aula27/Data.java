package modulo02.aula27;

public class Data {
    int currentPosition = 0;
    int currentSize = 4;
    Object[] data;

    /**
     * Construtor 
     * Inicializa o Array com o tamanho da variável currentSize
     */
    public Data() {
        this.data = new Object[currentSize];
    }

    /** Método que retorna a quantidade de elementos dentro do Array */
    public int size() {
        return currentPosition;
    }

    /**
     * Método que verifica se a posição atual é menor que o tamanho do Array, se
     * não, adiciona o objeto na possição e a incrementa, se não, dobra o tamanho do
     * Array através de um novo Array com os mesmos elementos do anterior e altera o
     * anterior para o tamanho do novo
     * 
     * @param obj objeto de uma classe
     * @return mensagem informativa sobre a adição no Array
     */
    public String add(Object obj) {
        String message;

        if (this.currentPosition < this.data.length) {
            data[currentPosition] = obj;
            currentPosition++;
        } else {
            currentSize = currentSize * 2;
            Object[] dataTwo = new Object[currentSize];

            for (int i = 0; i < data.length; i++) {
                dataTwo[i] = data[i];
            }
            data = dataTwo;
        }

        message = "Salvo com sucesso";
        return message;
    }

    /**
     * Método que verifica se determinado objeto existe no Array
     * 
     * @param obj objeto de uma classe
     * @return true se existir, false se não existir
     */
    public boolean contains(Object obj) {
        for (int i = 0; i < currentPosition; i++) {
            if (data[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que busca um elemento no Array, se ele existir, chama a função de
     * reogarnizar e exclui a posição do objeto
     * 
     * @param obj objeto de uma classe
     * @return mensagem informativa sobre a remoção
     */
    public String remove(Object obj) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(obj)) {
                rearrange(i);
                currentPosition--;
                return "Removido com sucesso!";
            }
        }
        return "Não encontrado";
    }

    /**
     * Método que reorganiza os elementos do Array os passando uma posição para trás
     * 
     * @param position posição que será deletada e os elementos passarão a ocupar
     */
    public void rearrange(int position) {
        for (int i = position; i < data.length - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
    }
}
