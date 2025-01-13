package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12,0,5};
        ArrayList<Integer> arr = new ArrayList<>();
        int noz = 0;
        for (int ele : nums){
            if (ele!=0) arr.add(ele);
            else noz++;
        }
        for (int i=0; i<=noz; i++){
            arr.add(0);
        }
        for (int i=0; i< nums.length; i++){  // Copy elements back to the original array
            nums[i] = arr.get(i);
        }
        System.out.println(Arrays.toString(nums)); // print the updated array
    }
}
