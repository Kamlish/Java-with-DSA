package JavaWithDSA.ArrayList10;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();

        // to add el
        list.add(5);
        list.add(6);
        list.add(2);

        System.out.println(list);

        // to get el
        int element = list.get(2);
        System.out.println(element);

        // to add in between
        list.set(0,7);
        System.out.println(list);

        // to remove
        list.remove(0);
        System.out.println(list);

        // to check size of array
        int size = list.size();
        System.out.println(size);

        // sort array
        Collections.sort(list);
        System.out.println(list);





    }
}
