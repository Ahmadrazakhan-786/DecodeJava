package Stack;
import java.util.*;
public class Nextgreater {
    public static void main(String[] args){
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        res[n-1] = -1; // Last element has no next greater element
        st.push(arr[n-1]);

        for (int i= n-2; i>=0; i--){
            while (st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if (st.size()==0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i=0; i<res.length; i++){
            System.out.print(res[i] + " "); // TC = O(n^2)
        }
    }
}
