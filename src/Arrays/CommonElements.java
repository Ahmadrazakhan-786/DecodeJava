package Arrays;
import java.util.*;
public class CommonElements {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        int i=0, j=0;
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]) i++;
            else if(a[i]>b[j]) j++;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
