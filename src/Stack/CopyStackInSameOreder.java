package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CopyStackInSameOreder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements you want to insert:");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for (int i=1; i<=n; i++){
            int x = sc.nextInt(); // int variable input
            st.push(x);
        }
        System.out.println(st);
        // Reverse Order:
        Stack<Integer> rt = new Stack<>();
        while (st.size()>0){
            int x = st.peek(); // access the first ele of  the given stack
            rt.push(x); // naye stack (rt) me usko push kar do
            st.pop();

          // M-2: Reverse order
           // rt.push(st.pop());
        }
        Stack<Integer> gt = new Stack<>();
        while(rt.size()>0){
            int x = rt.peek();
            gt.push(x);
            gt.pop();
        }
//        System.out.println(rt); // it will give the result in reverse order
        System.out.println(gt); // T.C = O(n)
    }
}
