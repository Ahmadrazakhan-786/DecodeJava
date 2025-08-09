package LinkedList;
class LastNode{
    int val;
    LastNode next;

    LastNode(int val){
        this.val = val;
    }
}

public class NthNodefromlast {

    public static int Required(LastNode head, int n){
        if (head == null) return -1;//empty LL
        LastNode slow = head;
        LastNode fast = head;

        for (int i=1; i<=n; i++){
            if (fast == null) return -1; // n>= len
            fast = fast.next;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }

    public static void print(LastNode head){
        LastNode temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LastNode a = new LastNode(10);
        LastNode b = new LastNode(20);
        LastNode c = new LastNode(30);
        LastNode d = new LastNode(40);
        LastNode e = new LastNode(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next =e;

        print(a);
        System.out.println("Nth node from last is :"+ Required(a,5));
    }
}
