package LinkedList;

class SLL{
    Node head;
    Node tail;
    int size;

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if (head == null) { // LL is empty
            head = temp;
            tail  = temp;
        }
        else{ // LL is not empty
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insetAtBeginning(int val){
        Node temp = new Node(val);
        if (head == null){ // LL is empty
            head = temp;
            tail = temp;
        }
        else { // LL is not empty
            temp.next = head;
            head = temp;
        }
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

public class Implementation {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();
        list.insetAtBeginning(70);
        list.display();
    }
}
