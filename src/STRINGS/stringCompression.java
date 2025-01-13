package STRINGS;

public class stringCompression {
    public static void main(String[] args) {
        String s = "aaaaaaaaagggbbbbaaedd";
        char[] arr = s.toCharArray();
        String ans = "";
        int i = 0, j = 0;
        while (j< arr.length){
            if (arr[j]==arr[i]) j++;
            else {
                ans += arr[i]; // char add kiya
                int len = j-i; // length push back ki
                if (len>1) ans += len;
                i = j;
            }
        }
        ans += arr[i]; // ye dono  step dubara isliye kiya
        int len = j-i; // taki last item ki vi value v add ho
        if (len>1) ans += len;
        System.out.println(ans);
    }
}
