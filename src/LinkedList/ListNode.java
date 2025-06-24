package LinkedList;
class Node{
   int val;
   Node next;

   Node(int val){
       this.val = val;
   }
}

public class ListNode {
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b; // 10->20 (linking)
        b.next = c; // 10->20->30
        c.next = d; // 10->20->30->40
        d.next = e; // 10->20->30->40->50

        print(a);

        // Singly Linked  List:
//        System.out.println(a.val);
//        System.out.println(a.next.val);
//        System.out.println(a.next.next.val);
//        System.out.println(a.next.next.next.val);
//        System.out.println(a.next.next.next.next.val);

//        Node temp  = a;
//        while(temp != null){
//            System.out.println(temp.val);
//            temp = temp.next;
        }
    }


//        System.out.println(a); // will give u the address
//        System.out.println(a.val); // will give the value
//        System.out.println(a.next); // will give null
