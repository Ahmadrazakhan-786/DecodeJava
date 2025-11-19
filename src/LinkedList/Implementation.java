package LinkedList;

class SLL{
    Node head;
    Node tail;
    int size;

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if (head == null) { // LL is empty
            head = temp;
            tail = temp;
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
    void insert(int idx, int val){
        if (idx == 0){
            insetAtBeginning(val);
            return;
        }
        if (idx == size){
            insertAtEnd(val);
            return;
        }
        if (idx > size){
            System.out.println("Invalid index");
            return;
        }

        Node temp = new Node(val);
        Node x = head;
        for (int i=1; i<=idx-1; i++){
            x = x.next;
        }
        // insertion part
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int getElement(int idx) throws Error{
        if (idx == size-1) return tail.val;
        if (idx >= size || idx <0){
            throw new Error("Invalid Index");
        }
        Node temp = head;
        for (int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx, int val) throws Error{
        if (idx == size-1){
            tail.val = val;
        }
        if (idx >= size || idx <0){
            throw new Error("Invalid Index");
        }
        Node temp = head;
        for (int i=1; i<=idx; i++){
            temp = temp.next;
        }
        temp.val = val;
    }
    void deleteAtHead() throws Error{
        if (head == null) throw new Error("List is Empty");
        head = head.next;
        if (head==null) tail = null; // for one size ll
        size--;
    }
    void deleteAtIndex(int idx) throws Error{
        if (idx == 0){
            deleteAtHead();
            return;
        }
        if (head == null) throw new Error("List is Empty");
        if (idx<0 || idx>=size) throw new Error("Invalid Index");

        Node temp = head;
        for (int i=1; i<=idx-1; i++){
            temp = temp.next; // temp ko aage badhana
        }
        if (temp.next == tail) tail = temp;
        temp.next = temp.next.next;
        size--;
    }
    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    boolean search(int val){
        if (head == null) return false; // bcz agr ll khali hai to ele mili nhi
        Node temp = head;
        while (temp!=null){
            if (temp.val == val) return true;
            temp = temp.next;
        }
        return false ; // agr puri ll travel krne ke baad v nhi mili to return false
    }
}

public class Implementation {
    public static void main(String[] args) {
        SLL list = new SLL();
//        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();
//        list.insetAtBeginning(70);
//        list.display();
//        list.insert(2,100);
//        list.display();
//
//        list.insert(10,80);
//        list.display();

//        System.out.println(list.getElement(3));
//        System.out.println(list.getElement(-1));
//        System.out.println(list.getElement(6));

//        list.set(3,65);
//        list.display();
//        list.deleteAtHead();
//        list.display();
//
//        list.deleteAtIndex(3);
//        list.display();

        list.deleteAtHead();
        list.display();
        System.out.println(list.search(40));

    }
}
