//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList myList = new ArrayList();


        myList.add("Platano");
        myList.add("Manzana");
        myList.add("Garbanzo");
        myList.add("Naranja");
        myList.add("Piña");

        myList.add(1, "Pera");
        myList.remove("Garbanzo");
        myList.remove("Platano");
        myList.remove("Manzana");
        myList.remove("Pera");
        myList.remove("Naranja");
        myList.remove("Piña");
        myList.remove("Pia");




        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

    }
}