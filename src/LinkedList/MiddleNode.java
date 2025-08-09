package LinkedList;
class ListNodes{
    int val;
    ListNodes next;

    ListNodes(int val){
        this.val = val;
    }


}

public class MiddleNode {
  public static  int FindMiddle(ListNodes head){
        if (head == null) return -1;
        if (head.next == null) return head.val;

        ListNodes slow = head;
        ListNodes fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
    public static void print(ListNodes head){
        ListNodes temp = head;
        while (temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        ListNodes a = new ListNodes(10);
        ListNodes b = new ListNodes(20);
        ListNodes c = new ListNodes(30);
        ListNodes d = new ListNodes(40);
        ListNodes e = new ListNodes(50);
        ListNodes f = new ListNodes(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next =e;
        e.next = f;

        print(a);
        System.out.println("The middle node is: " + FindMiddle(a));

    }
}
