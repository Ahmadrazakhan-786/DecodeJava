package Stack;

import java.util.Stack;

public class RecursivelyReverseStack {
    public static void pushAtBottom(Stack<Integer> st, int x){
        if (st.size()==0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
    public static void Reverse(Stack<Integer> st){
        if (st.size()==1) return; // base case
        int top = st.pop();
        Reverse(st); // bache ele ko rev kar dega after removing top ele
        pushAtBottom(st, top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }
}
