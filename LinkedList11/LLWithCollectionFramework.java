package JavaWithDSA.LinkedList11;
import java.util.LinkedList;

public class LLWithCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Insert / Add
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("last");
        System.out.println(list);

        list.add("list");

        // Remove / delete
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        // size
        System.out.println(list.size());

        // print

        for (int i=0; i<list.size();i++){
            System.out.print(list.get(i) +" -> ");
        }
        System.out.print("NULL");

    }




}
