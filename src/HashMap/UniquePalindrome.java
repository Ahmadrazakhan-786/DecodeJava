package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class UniquePalindrome {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> firstmap = new HashMap<>();
        HashMap<Character,Integer> lastmap = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (!firstmap.containsKey(ch)) firstmap.put(ch,i);
            lastmap.put(ch,i);
        }
        int count = 0;
        for (char ch : firstmap.keySet()){
            int firstIdx = firstmap.get(ch);
            int lastIdx = lastmap.get(ch);
            HashSet<Character> set = new HashSet<>();
            for (int i=firstIdx+1; i<=lastIdx-1; i++){
                set.add(s.charAt(i));
            }
            count += set.size();
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
