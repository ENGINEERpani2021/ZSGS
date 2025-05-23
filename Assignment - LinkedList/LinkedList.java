class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedList {
    private Node head;
    public void insertNode(Node node){
        if(head==null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }
    public void printFirstLast(){
        Node temp = head;
        System.out.println(temp.data);
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertNode(new Node(5));
        ll.insertNode(new Node(10));
        ll.insertNode(new Node(15));
        ll.insertNode(new Node(20));
        ll.insertNode(new Node(25));
        ll.printFirstLast();
    }
}
