package List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.add("A");
        stringLinkedList.add("B");
        stringLinkedList.add("C");
        stringLinkedList.add("D");

        Iterator<String> itr = stringLinkedList.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
