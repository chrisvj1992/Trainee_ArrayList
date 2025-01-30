public interface List {
    void add(String element);
    void add(int index, String element);
    void remove(String element);
    void remove(int index);
    String get(int index);
    int size();
}
