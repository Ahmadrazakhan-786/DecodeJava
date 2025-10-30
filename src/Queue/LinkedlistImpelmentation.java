package Queue;

public class LinkedlistImpelmentation {
    public static class Node{ // user def data types
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class queueLL{ // user def data structure
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x){
            Node temp = new Node(x); // temp node bnaya jisme jo v val aaega isme daal dunga
            if (size==0){
                head = tail = temp; // agr queue empty hai  to in dono ko temp pe daal do
            }else {
                tail.next = temp;
                tail =temp;
            }
            size++;
        }

        public int remove(){
            if (size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        public int peek(){
            if (size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        public void display(){
            if (size==0){
                System.out.println("Queue is empty");
            }
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
//        q.display(); // empty
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();
        System.out.println(q.isEmpty()); // false
    }
}
