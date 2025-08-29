package Stack;
import java.util.Stack;
public class OverflowUnderflow {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        // if we will pop/peek one more  time then there will be stack underflow
        st.pop();
        System.out.println(st); // it will give error

    }
}
