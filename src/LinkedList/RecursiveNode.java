package LinkedList;

class Nodes{
    int val;
    Nodes next;

    Nodes(int val){
        this.val = val;
    }
}

public class RecursiveNode {
    public static void recusivelist(Nodes head){
        if (head == null) return; // base case
        System.out.println(head.val);
        recusivelist(head.next);

        // if we want to print the linked list in reverse order then:
//        recusivelist(head.next);
//        System.out.println(head.val);
    }
    public static void main(String[] args) {
        Nodes a = new Nodes(50);
        Nodes b = new Nodes(450);
        Nodes c = new Nodes(30);

        a.next = b;
        b.next = c;

        recusivelist(a);
    }
}
