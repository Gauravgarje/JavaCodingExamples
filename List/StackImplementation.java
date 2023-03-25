package List;

import java.util.Iterator;
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();

        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");
        stringStack.push("D");

        Iterator<String> itr = stringStack.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // shows the last/topmost element of the stack
        System.out.println("Peek: " + stringStack.peek());

        // to remove an element from the top
        System.out.println("Removal in process");
        itr.remove();
        System.out.println("Stack: " + stringStack.toString());

    }
}
