import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> ll =new LinkedList();
        ll.add("one");ll.add("two");ll.add("three");
        ll.add("four");ll.add("five");
        System.out.println(ll.toString());
        ListIterator itr = ll.listIterator();
        while(itr.hasNext()){
            String str = (String)itr.next();
            if(str.equals("three"))itr.set("THREE");
        }
        System.out.println(ll.toString());
    }
}
