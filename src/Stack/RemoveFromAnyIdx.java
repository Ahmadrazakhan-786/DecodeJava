package Stack;

import java.util.Stack;

public class RemoveFromAnyIdx {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        int idx = 3;
        while (st.size()>idx){
            rt.push(st.pop());
        }
        st.pop();
        while (rt.size()>0){
            st.push(rt.pop());
        }
        System.out.print(st);
    }
}
