package Stack;

import java.util.Stack;

public class InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println(st);
        int idx = 3;
        int x = 8;
        Stack<Integer> rt = new Stack<>();
        while (st.size()>idx){
            rt.push(st.pop()); // naye stack rt me push kar rhe h aur st stack ko khali v kar diya
        }
        st.push(x); // fir jis ele(x) ko us particular idx pe rkhna h usko st me push kar diya
        while (rt.size()>0){
            st.push(rt.pop()); // fir rt ko khali karke st me push kar diya
        }
        System.out.println(st);
    }
}
