package Sliding_Window;

public class LongestSubarrof1 {
    public static void main(String[] args) {

    }
    public int longestSubarray(int[] arr) {
        int n = arr.length, i=0, j=0;
        int zeroes=0, maxlen=0;

        int z=0;
        for(int ele:arr){ // agr arr me saare zero hua to
            if(ele==0) z++;
        }
        if(z==0) return n-1; // removing 1 as mughe ek ele remove krna hi hai

        while (i<n && arr[i]==0) i++; // moving i to first 1
        if(i==n) return 0; // if all ele are zero then return 0
        j = i;
        while (j<n){
            if (arr[j]==1) j++;
            else{ // arr[j]=0
                if (zeroes==0){
                    zeroes++;
                    j++;
                }
                else{ // zeroes=1
                    int len = j-i-1;
                    maxlen = Math.max(maxlen,len);
                    j++;
                    // ab aage ka window v check karna hai
                    while (arr[i]==1) i++; // jab tak 1 hai i ko inc karo but
                    i++; // 0 pe stop nhi hona hai uske ek aage badhao isliye i++ karo
                }
            }
        }
        if(zeroes==0) return j-i; // agar baad me 0 encounter nhi hua to
        int len = j-i-1;
        maxlen = Math.max(maxlen,len);
        return maxlen;

    }
}
