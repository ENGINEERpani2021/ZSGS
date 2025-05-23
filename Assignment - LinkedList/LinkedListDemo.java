import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList();
        for(int i=1;i<=10;i++){
            ll.add(i);
        }
        System.out.println(ll.toString());
        ll.remove(2);
        ll.pollLast();
        System.out.println(ll.toString());
    }
}
