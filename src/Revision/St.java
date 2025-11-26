package Revision;

import java.util.Stack;

    public class St {
        public static void main(String[] args){
            Stack<Integer> st = new Stack<>();
            st.push(1);
            st.push(10);
            st.push(23);
            st.push(75);

            for(int i = st.size(); i > 0; i--){ // reverse the stack
                System.out.println(st.peek()); // without using extra stack
                st.pop();
            }
        }
    }

