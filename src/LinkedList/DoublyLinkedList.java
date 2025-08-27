package LinkedList;
class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val = val;
    }
}
class DLL{
    dNode head;
    dNode tail;
    int size;
    void display(){
        dNode temp = head;
        while (temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtTail(int val){
        dNode temp = new dNode(val); // naya node banao
        if (size==0) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if (size == 0) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insert(int idx, int val){
        if (idx==0){
            insertAtHead(val);
            return;
        }
        if (idx==size){
            insertAtTail(val);
            return;
        }
        if (idx>size || idx<0){
            System.out.println("Invalid index");
            return;
        }
        dNode temp = new dNode(val);
        dNode x = head;
        for (int i=1; i<=idx-1; i++){
            x = x.next;
        }
        dNode y = x.next;
        x.next = temp; temp.prev = x;
        y.prev = temp; temp.next = y;
        size++;
    }
    void deleteAtHead() throws Error{
        if (head==null) throw new Error("List is Empty");
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteAtTail() throws Error{
        if (head==null) throw new Error("List is Empty");
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    void deleteAtIdx(int idx){
        if (idx==0){
            deleteAtHead();
            return;
        }
        if (idx==size){
            deleteAtTail();
            return;
        }
        if (idx>=size || idx<0){
            System.out.println("Invalid index");
        }
        dNode temp = head;
        for (int i=1; i<=idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp = temp.next;
        temp.prev = temp.prev.prev;
        size--;
    }
}


public class DoublyLinkedList {
    public static void print(dNode head){
        dNode temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printReverse(dNode tail){
        dNode temp = tail;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        dNode a = new dNode(10);
//        dNode b = new dNode(20);
//        dNode c = new dNode(30);
//        dNode d = new dNode(40);
//        a.next = b; b.prev = a;
//        b.next = c; c.prev = b;
//        c.next = d; d.prev = c;
//        print(a);
//        printReverse(d);
        DLL list = new DLL();
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.display();
        list.insertAtTail(70);
        list.display();
//        System.out.println(list.size);
        list.insertAtHead(5);
        list.display();
        list.insert(2,90);
        list.display();
        list.deleteAtIdx(3);
        list.display();
        list.deleteAtHead();
        list.display();
        list.deleteAtTail();
        list.display();
    }
}
