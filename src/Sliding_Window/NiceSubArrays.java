package Sliding_Window;

public class NiceSubArrays {
    public int numberOfSubarrays(int[] arr, int k) {
        int n = arr.length, i=0, j=0, count=0, a=0, b=0, k2=0;

        // First move 'i' to first odd number:
        while (i<n && arr[i]%2==0) i++;
        // Now move 'j' to kth odd number:
        while (j<n && k2<k){
            if (arr[j]%2!=0) k2++;
            if (k2==k) break;
            j++;
        }
//        j--; // qki ki hum window me ek extra position aage badh gye
        // Now move 'b' just before 1:
        b = j+1; // isme sbse pehle b ko j ke just aage put karo
        while (b<n && arr[b]%2==0) b++; // fir jab tab even hai aage badhate rhenge
        b--; // fir jaise hi odd hua to ye kaam -> Now move 'b' just before 1 ho jaaega

        // Sliding Window:
        while (b<n){
            count += (i-a+1)*(b-j+1); // maths
            a = i+1;
            i++;
            while (i<n && arr[i]%2==0) i++; // i ko next window pe rakh diya i.e 1 pe
            j = b+1; // ab j ko v apne position pe rakh do
            b = j+1;
            while (b<n && arr[b]%2==0) b++;
            b--;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
