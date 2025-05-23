import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListReverse {
    public static void reverseList(LinkedList ll){
        ListIterator itr = ll.listIterator();
        while(itr.hasNext()){
            itr.next();
        }
        while (itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }
    }
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList();
        ll.add('A');ll.add('B');ll.add('C');
        ll.add('D');ll.add('E');
        System.out.println(ll.toString());
        reverseList(ll);
    }
}
