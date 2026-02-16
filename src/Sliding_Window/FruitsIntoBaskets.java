package Sliding_Window;

import java.util.HashMap;

public class FruitsIntoBaskets {
    public int totalFruit(int[] arr) {
        int n = arr.length, i=0, j=0, maxLen=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while (j<n){
            if (map.containsKey(arr[j])){
                int freq = map.get(arr[j]);
                map.put(arr[j],freq+1);
            }
            else map.put(arr[j],1);

            while (map.size()>2){ // agar map ka size 2 se bada hai to start of the window hai waha se hatate rho aur i ko inc kro
                int freq = map.get(arr[i]);
                if (freq==1) map.remove(arr[i]); // agar freq 1 hi hai to pura remove kar do
                else map.put(arr[i],freq-1);
                i++;
            }
            int len = j-i+1;
            maxLen = Math.max(maxLen,len);
            j++;
        }
        return maxLen;
    }
    public static void main(String[] args) {

    }
}
