package Stack;
import java.util.*;
public class BalancedBrackets {
    public static boolean balanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i=0; i<n; i++){
            char ch = str.charAt(i); // character nikala from given char
            if (ch=='('){
                st.push(ch); // opening left brac aaya to push kar do
            }
            else { // ch==')'
                if (st.size()==0) return false; // agr opening right brac aaya to aur st empty hai to false
                if (st.peek()=='(') st.pop(); // agr opening left brac aaya aur aur fir closing brac aaya to pop '('
            }
        }
        if (st.size()>0) return false; // agr loop khtm ho jaae aur upar wala false hit na ho then check st size
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(balanced(str));
    }
}
