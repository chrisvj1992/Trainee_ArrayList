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
        listCapacity();                                 //evalua el tamaño del arreglo
        for (int i = size; i > index; i--) {            //recorre la lista desde el final pasando por cada espacio hasta llegar al index
            elements[i] = elements[i - 1];              // copia el valor del elemento que hay a la izquierda, a la derecha
        }
        elements[index] = element;                      //aqui se sobreescribe el valor por el nuevo a añadir, ya copiando el anterior
        size++;
    }

    @Override
    public void remove(String element) {
        if(size > 0) {
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(element)) {
                    for (int j = i; j < size - 1; j++) {
                        elements[j] = elements[j + 1];
                    }
                    size--;
                }
            }
        }
    }

    @Override
    public void remove(int index) {
        if(size > 0){
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
        else{
            System.out.println("No hay elementos en la lista");
        }
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
            int newLenght = elements.length * 2;
            String[] newElements = new String[newLenght];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
            System.out.println("valor incrementado");
        }
    }

}
