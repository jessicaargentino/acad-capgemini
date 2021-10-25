package modulo02.aula28.a01;

public class Data {
    private Object[] data;
    private int position;

    /**
     * Construtor - Inicializa o vetor de objetos com 5 posições
     */

    public Data() {
        this.data = new Object[5];
    }

    /**
     * Método que retorna a quantidade de objetos no vetor
     * 
     * @return quantidade de objetos
     */
    public int size() {
        return position;
    }

    /**
     * Método que adiciona um objeto ao vetor de objetos
     * 
     * @param obj objeto de uma classe
     */
    public void add(Object obj) {
        checkSize();
        this.data[position] = obj;
        position++;
    }

    /**
     * Método que chama a busca para verificar se o objeto está no array, se sim,
     * reorganiza o array e remove o objeto
     * 
     * @param obj
     */
    public void remove(Object obj) {
        int index = search(obj);
        if (index >= 0) {
            rearrange(index);
        }
    }

    /**
     * Método que verifica se um objeto existe no array
     * 
     * @param obj objeto de uma classe
     * @return true se existir, false se não existir
     */
    public boolean contains(Object obj) {
        int index = search(obj);
        if (index >= 0) {
            return true;
        }
        return false;
    }

    /**
     * Método que percorre o array a fim de verificar se determinado objeto existe
     * no mesmo
     * 
     * @param obj objeto de uma classe
     * @return o index/posição caso o objeto existir, -1 se não existir
     */
    private int search(Object obj) {
        for (int i = 0; i < data.length; i++) {
            if (obj.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Método que percorre o array o reorganizando uma posição para frente e
     * decrementa o tamanho total do mesmo
     * 
     * @param pos
     */
    private void rearrange(int pos) {
        for (int i = pos; i < position; i++) {
            data[i] = data[i + 1];
        }
        position--;
    }

    /**
     * Método que verifica se o tamanho do array foi excedido, se sim, adiciona mais
     * cinco posições ao array
     */
    private void checkSize() {
        if (position >= this.data.length) {
            int newSize = this.data.length + 5;
            Object[] dataTwo = new Object[newSize];
            for (int i = 0; i < data.length; i++) {
                dataTwo[i] = data[i];
            }
            data = dataTwo;
        }
    }
}
