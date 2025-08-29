package Stack;
import java.util.Stack;
public class BasicsofStack {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(10);
        st.push(23);
        st.push(75);
        // peek: return the top-most value
        System.out.println(st.peek());
        System.out.println(st); // it will print the whole stack in an order
        st.pop(); // it will remove the top element
        System.out.println(st);
        System.out.println("Size is : "+st.size());

        while(st.size()>1){ // this will return the first element from the stack if 1 if we want 2nd then will use > 2
            st.pop();
        }
        System.out.println(st.peek());
    }
}
