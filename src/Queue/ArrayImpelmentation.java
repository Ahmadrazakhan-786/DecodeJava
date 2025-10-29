package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayImpelmentation {
    public static class queue{
        // Front se chezze nikalti hai aur Rear se cheeze dalti hai:
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[100];

        public void add(int val){
            if (r==arr.length-1){
                System.out.println("Queue is full");
                return; // y bcz pura queue full ho chuka aur yaha pe end ho jaaega
            }
            if(f==-1){ // queue is currently empty
                f = r = 0;
                arr[0] = val;
            }
            else {
                arr[r+1] = val; // iska matlab hai ki ki jab v val add hogi wo rear ke agle wale idx pe hogi
                r++;
            }
            size++;
        }

        public int remove(){
            if (size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x = arr[f]; // jo front pe hai usko nikal lo
            f++;
            size--;
            return x;
        }

        public int peek(){
            if (size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f]; // jo front pe hoga wahi mera peek ele hoga
        }
        public boolean isEmpty(){
            if (size==0) return true;
            else return false;
        }
        public void display(){
            if (size==0){
                System.out.println("Queue is empty");
            }else {
                for (int i=f; i<=r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
