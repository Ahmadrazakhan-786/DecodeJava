package GoodQsn;

import java.util.Scanner;

public class FrequecyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        int[] frequency = new int[26];
        // 0->a, 1->b,...,25-z;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // character fetching
            int idx = (int) ch - 97; // ascii-97 = idx
            frequency[idx]++;
        }
        int maxFreq = -1;
        for (int i = 0; i < frequency.length; i++) {
            maxFreq = Math.max(maxFreq, frequency[i]);
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i]==maxFreq){
                char ch = (char)(i+97);
                System.out.print(ch+" ");
            }
        }
    }
}
