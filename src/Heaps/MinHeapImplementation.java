package Heaps;
class Minheap{
    int[] arr;
    int size;
    Minheap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int num){
        arr[size++] = num;
        upHeapify(size-1); // size-1 bcz of rearrangement
    }
    public void upHeapify(int child){
        if (child==0) return; // iska matlab agr child 0th idx pe hai to seedhe return kar do qki aage koi work nhi hoga
        int parent = (child-1)/2; //  formula to fetch the value of parent
        if (arr[child]<arr[parent]){
            swap(child,parent); // swap krne ke badd fir upHeapify method
            upHeapify(parent); // chala do qki aur v ele ho skte he jo swap hone wale ho
        }
    }
    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int peek(){
        if (size==0){
            System.out.println("Heap is empty");
            return -1;
        }
        return arr[0]; // y bcz arr ka pehla ele hi peek hoga
    }
    public int size(){
        return size; // size of the array
    }
}
public class MinHeapImplementation {
    public static void main(String[] args) {
        Minheap  pq = new Minheap(10);
        pq.add(1);
        pq.add(6);
        pq.add(2);
        System.out.println(pq.size());
        pq.add(0);
        System.out.println(pq.peek());
        pq.add(-4);
        System.out.println(pq.peek());

    }
}
