package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImplementation {
    public static void main(String[] args) {
        // Creating arrayList
        ArrayList<String> stringArrayList = new ArrayList<>();

        // Adding object in arrayList
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("C");

        Iterator<String> itr = stringArrayList.iterator();

        // Traversing list through iterator
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
