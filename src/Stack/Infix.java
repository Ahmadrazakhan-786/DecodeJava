package Stack;

import java.util.Stack;

public class Infix {
    public static void main(String args[]){
        String str = "9-5+3*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> opr = new Stack<>();
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i); // character nikal lo: eg-> ch = '5'
            int ascii = (int)ch; // jo char nikli uski ascii value nikal lo: eg-> ascii = 53
            // '0'-> 48 and '9'-> 57
            if (ascii>=48 && ascii<=57){
                val.push(ascii-48); // eg-> 53-48 = 5 as number
            }
            else if (opr.size()==0){
                opr.push(ch);
            }
            else{
                if (ch=='+' || ch=='-'){
                    // work:
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (opr.peek()=='-') val.push(v1-v2);
                    if (opr.peek()=='+') val.push(v1+v2);
                    if (opr.peek()=='*') val.push(v1*v2);
                    if (opr.peek()=='/') val.push(v1/v2);
                    opr.pop();
                    // push
                    opr.push(ch);
                }
                if (ch=='*' || ch=='/'){
                    if (opr.peek() == '*' || opr.peek() == '/') {
                        // work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (opr.peek()=='-') val.push(v1-v2);
                        if (opr.peek()=='+') val.push(v1+v2);
                        if (opr.peek()=='*') val.push(v1*v2);
                        if (opr.peek()=='/') val.push(v1/v2);
                        opr.pop();
                        // push
                        opr.push(ch);
                    }
                    else opr.push(ch);
                }
            }
        }
        // val stack size -> 1:
        while (val.size()>1){
            int v2 = val.pop();
            int v1 = val.pop();
            if (opr.peek()=='-') val.push(v1-v2);
            if (opr.peek()=='+') val.push(v1+v2);
            if (opr.peek()=='*') val.push(v1*v2);
            if (opr.peek()=='/') val.push(v1/v2);
            opr.pop();
        }
        System.out.println(val.peek());
    }
}
