//Program to create a Simple LinkedList
public class LinkList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static void main(String[] args) {
        LinkList l1=new LinkList();

        l1.head=new Node(1);
        Node Second=new Node(2);
        Node Third=new Node(3);

        l1.head.next=Second;
        Second.next=Third;
        Third.next=null;
    }
}
