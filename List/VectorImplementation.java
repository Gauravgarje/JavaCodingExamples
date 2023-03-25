package List;

import java.util.Iterator;
import java.util.Vector;

public class VectorImplementation {
    public static void main(String[] args) {
        Vector<String> stringVector = new Vector<>();

        stringVector.add("A");
        stringVector.add("B");
        stringVector.add("C");
        stringVector.add("D");

        Iterator<String> itr = stringVector.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
