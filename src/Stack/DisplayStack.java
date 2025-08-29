package Stack;

import java.util.Stack;

public class DisplayStack {
    public static void displayRevRecursive(Stack<Integer> st){
        if (st.size()==0) return;
        int top = st.pop();
        System.out.print(top + " ");
        displayRevRecursive(st);
        st.push(top);
    }
    public static void displayRecursive(Stack<Integer> st){
        if (st.size()==0) return;
        int top = st.pop();
        displayRecursive(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        displayRevRecursive(st);
        System.out.println();
        displayRecursive(st);
//      System.out.println(st); M-1: Built-in functions

        //M-2: Stack Reverse:
//        Stack<Integer> rt = new Stack<>();
//        while(st.size()>0){
//           rt.push(st.pop());
//        }
//        while(rt.size()>0){
//            int x = rt.pop(); // rt ko khali krke ele(x) me store kar diya
//            System.out.print(x + " ");
//            st.push(x);
//        }
        //M-3: Using Array:
//        int n = st.size();
//        int[] arr = new int[n]; // is array me st ka size aa gya
//        for (int i=n-1; i>=0; i--){ // stack ko khali krke reverse order me array me laga do
//            int x = st.pop();
//            arr[i] = x; // arr me ele(x) ko laga do
//        }
//        // wapis se arr ko pop krke st me daal do
//        for (int i=0; i<n; i++){
//            System.out.print(arr[i] + " ");
//            int x = arr[i];
//            st.push(x);
//
//        }
    }
}
