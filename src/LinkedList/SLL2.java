package LinkedList;

public class SLL2 {
   static Node head;
    public static void main(String[] args) {
        SLL2 t= new SLL2();
        t.head=new Node(1);
        Node second = new Node(3);
        Node third =new Node(5);
        t.head.next=second;
        second.next=third;
        append(7);
        traversal(t.head);
    }
    static class Node {
        int data;
        Node next;
        public Node(int da) {this.data=da;}
    }
    public static void  traversal(Node head)
    {
        Node n =head;
        while (n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }
    public static void append(int new_Data)
    {
        Node new_node= new Node(new_Data);
        if(head==null)
        {
            head=new Node(new_Data);
            return;
        }
        new_node.next=null;
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=new_node;
        return;
    }
}
