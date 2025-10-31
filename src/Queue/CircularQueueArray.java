package Queue;

public class CircularQueueArray {
    public static class Cqa{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) throws Exception{
            if (size==arr.length){ // agar pura queue hi full h
                throw new Exception("Queue is full");
            } else if (size==0) {
                 f = r = 0;
                 arr[0] = val;
            } else if (r<arr.length-1) { // normal case
                arr[++r] = val;
            } else if (r==arr.length-1) {
                r = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() throws Exception{
            if (size==0){
                throw new Exception("Queue is empty");
            }
            else{
                int val = arr[f];
                if (f==arr.length-1) f = 0;
                else f++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception{
            if (size==0){
                throw new Exception("Queue is empty");
            }
            else return arr[r];
        }

        public boolean isEmpty(){
            if (size==0) return true;
            else return false;
        }

        public void display(){
            if (size==0){
                System.out.println("Queue is empty");
            } else if (f<=r) {
                for(int i=f; i<=r; i++){
                    System.out.print(arr[i]+ " ");
                }
            }else { // rear < front
                for (int i=f; i<= arr.length-1; i++){
                    System.out.print(arr[i] + " ");
                }
                for (int i=0; i<= r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        Cqa q = new Cqa();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display(); // 1 2 3 4
        q.remove();
        q.display(); // 2 3 4
        q.add(5);
        q.display(); // 2 3 4 5
        q.add(6);
        q.display(); // 6 2 3 4 5 -> 2 3 4 5 6
        for (int i=0; i<q.arr.length; i++){
            System.out.print(q.arr[i] + " "); // 6 2 3 4 5
        }
//        q.add(7); // it will give error as the queue is full bcz max size is 5
//        q.display();

    }
}
