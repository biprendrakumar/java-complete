package collection_framework.Arraylist;
import java.util.ArrayList;
public class add {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.remove("Apple");
        list.add(0, "Mango");
        list.set(0, "Orange");
        // System.out.println(list.get(0));
        // System.out.println("Fruits in the list: " + list);
        // System.out.println("Size of the list: " + list.size());
        // for (String fruit : list) {
        //     System.out.println(fruit);
        // }
        System.out.println(list.contains("Banana"));
        // list.clear();
        // System.out.println(list);
    }
}
