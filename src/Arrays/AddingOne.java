package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class AddingOne {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1;
        for (int i=n-1; i>=0; i--){
            if (arr[i]+carry <=9) {
                ans.add(arr[i]+ carry);
                carry = 0; // mtlab agr val <=9 hui to carry aage jaaega nhi isliye 0 kar diya
            }
            else{ // arr[i]+ carry = 10
                ans.add(0); // matlab agar val 10 ho gyi to to pehle 0 add hoga
                carry = 1; // fir uska carry 1
            }
        }
        if (carry == 1) ans.add(1);
        Collections.reverse(ans);
        System.out.print(ans);
    }
}
