package LinkedList;

class RLL{
    int val;
    Node next;
    Node head;
    Node tail;
    int size;


    void insertAtEnd(int val){
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
            return;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtBeg(int val){
        Node temp = new Node(val);
        if (head == null){
            head = temp;
            tail = temp;
            return;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
public class Revision {
    public static void main(String[] args) {
        RLL list = new RLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.display();

        list.insertAtBeg(30);
        list.display();

    }
}
