package modulo02.aula28.a01;

public class Data {
    private Object[] data;
    private int position;

    public Data(){
        this.data = new Object[5];
    }

    public int size() {
        return position;
    }

    public void add(Object obj) {
        checkSize();
        this.data[position] = obj;
        position++;
    }

    public void remove(Object obj) {
        int index = search(obj);
        if (index >= 0) {
            rearrange(index);
        }
    }

    public boolean contains(Object obj) {
        int index = search(obj);
        if (index >= 0) {
            return true;
        }
        return false;
    }

    private int search(Object obj) {
        for (int i = 0; i < data.length; i++) {
            if (obj.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    private void rearrange(int pos) {
        for (int i = pos; i < position; i++) {
            data[i] = data[i + 1];
        }
        position--;
    }

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
