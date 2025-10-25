package Stack;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for (int i=prefix.length()-1; i>=0; i--){
            char ch = prefix.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                String s = ""+ ch;
                val.push(s);
            }else{
                String v1 = val.pop();
                String v2 = val.pop();
                char op = ch;
                // we have to  convert into postfix: v1v2op
                String t = v1 + v2 + op;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
