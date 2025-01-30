public class ArrayList implements List {
    private String[] elements;
    private int size;
    private static final int LENGHT_ARRAY = 10;

    public ArrayList() {
        this.elements = new String[LENGHT_ARRAY];
        this.size = 0;
    }

    @Override
    public void add(String element) {
        listCapacity();
        elements[size] = element;
        size++;
    }

    @Override
    public void add(int index, String element) {
        listCapacity();
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

    private void listCapacity() {
        if (size == elements.length) {
            int newLenght = LENGHT_ARRAY * 2;
            String[] newElements = new String[newLenght];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

}
