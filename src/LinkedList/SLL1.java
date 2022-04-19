package LinkedList;

public class SLL1 {
    node head;
    public static void main(String[] args) {
        SLL1 s= new SLL1();
        s.head=new node(2);
        node second =new node(3);
        node third =new node(4);
        s.head.next=second;
        second.next=third;
        s.traversal(s.head);
    }
    public static void traversal(node head){
        node n = head;
        while(n!=null)
        {
            System.out.println(n.data+" ");
            n=n.next;
        }
    }
     static class node {
        int data ;
        node next;
        node(int d){
            this.data= d;
        }
    }

}
