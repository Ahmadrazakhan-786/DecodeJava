package Stack;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for (int i=str.length()-1; i>=0;i--){ // move backward
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii>=48 && ascii<=57){
                String s = ch + "";
                val.push(s);
            } else {
                String v1 = val.pop(); // isme pehle v1 pop krenge
                String v2 = val.pop();
                char op = ch;
                String t = "(" + v1+op+v2 + ")";
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
