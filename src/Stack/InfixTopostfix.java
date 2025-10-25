package Stack;

import java.util.Stack;

public class InfixTopostfix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println(infix);
        Stack<String> val = new Stack<>();
        Stack<Character> opr = new Stack<>();
        for (int i=0; i<infix.length(); i++){
            char ch = infix.charAt(i); // character nikal lo: eg-> ch = '5'
            int ascii = (int)ch;
            if (ascii>=48 && ascii<=57){ // 0 to 9
                String s = "" + ch; // converted number into strings
                val.push(s);
            }
            else if (opr.size()==0 || ch=='(' || opr.peek()=='('){
                opr.push(ch);
            } else if (ch==')') {
                while (opr.peek()!='('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = opr.pop();
                    String t = v1 + v2 + o; // operatorv1v2
                    val.push(t);
                }
                opr.pop(); // '(' hata diya
            }
            else{
                if (ch=='+' || ch=='-'){
                    // work:
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = opr.pop();
                    String t = v1 + v2 + o; // operatorv1v2
                    val.push(t);
                    // push
                    opr.push(ch);
                }
                if (ch=='*' || ch=='/'){
                    if (opr.peek() == '*' || opr.peek() == '/') {
                        // work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = opr.pop();
                        String t = v1 + v2 + o; // operatorv1v2
                        val.push(t);
                        // push
                        opr.push(ch);
                    }
                    else opr.push(ch);
                }
            }
        }
        // val stack size -> 1:
        while (val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = opr.pop();
            String t = v1 + v2 + o; // operatorv1v2
            val.push(t);
        }
        String postfix = val.pop(); // jo val ke peek pe aaya usko nikal diya
        System.out.println(postfix);
    }
}
