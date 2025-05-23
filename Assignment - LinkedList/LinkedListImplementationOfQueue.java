import java.util.LinkedList;

public class LinkedListImplementationOfQueue {
    LinkedList<String> ll = new LinkedList();
    public void removeElement(){
        ll.remove(0);
    }
    public void insert(String str){
        ll.add(str);
    }

    @Override
    public String toString() {
        return ll.toString();
    }

    public static void main(String[] args) {
        LinkedListImplementationOfQueue queue = new LinkedListImplementationOfQueue();
        queue.insert("Alice");queue.insert("Bob");
        queue.insert("Charlie");queue.insert("Diana");
        System.out.println(queue.toString());
        queue.removeElement();queue.removeElement();
        System.out.println(queue.toString());
    }
}
