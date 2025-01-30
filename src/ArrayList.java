public class ArrayList implements List {
    private String[] elements;
    private int size;
    private int lenghtColection = 2;

    public ArrayList() {
        this.elements = new String[lenghtColection];
        this.size = 0;
    }

    @Override
    public void add(String element) {

        if (size == lenghtColection) {
            lenghtColection *= 2;
        }
        elements[size] = element;
        size++;
    }

    @Override
    public void add(int index, String element) {
        if (size == lenghtColection) {
            lenghtColection *= 2;
        }

        //recorre la lista hacia la derecha, hasta que llega al index, copia el elemento y aumenta el tamaño de la lista
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
            elements[i - 1] = element;
        }
        size++;
    }

    @Override
    public void remove(String element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                size--;
            }
        }
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    @Override
    public String get(int index) {
        return elements[index];
    }

    @Override
    public int size() {
        return this.size;
    }

}
