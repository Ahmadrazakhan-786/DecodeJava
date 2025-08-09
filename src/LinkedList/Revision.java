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
    void insert(int idx, int val){
        if (idx == 0){
            insertAtBeg(val);
        }
        if (idx == size){
            insertAtEnd(val);
        }
        if (idx>size){
            System.out.println("Invalid index");
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i=1; i<=idx-1;i++){
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int getElement(int idx) throws Error{
        if (idx == size-1) return tail.val;
        if (idx < 0 || idx > size) {
            throw new Error("Invalid index");
        }
        Node temp = head;
        for (int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
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

        list.insert(2,100);
        list.display();

//       list.insert(10,100);
//       list.display();

        System.out.println(list.getElement(3));


    }
}
