package Stack;
import java.util.*;
public class MinRemoval {
    public static int minRemoval(String str){
        Stack<Character> st = new Stack<>();
        int removals = 0;
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if (ch=='('){
                st.push(ch);
            } else if (ch==')') {
                if (st.size()==0) removals++;
                else st.pop();
            }
        }
        removals += st.size();
        return removals;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(minRemoval(str));
    }
}
