package Sorting;
import java.util.Arrays;
public class Majorityelement {
    public static void main(String[] args) {
        int[] num = {3, 3, 3, 3, 1, 2, 3};
        int n = num.length;

        Arrays.sort(num);
        int x = num[n/2];
        int count = 0;

        for (int ele : num) {
            if (ele == x) {
                count++;
            }
        }
            if (count > n/2){
                System.out.println("the majority element is " + x);
            } else {
                System.out.println("there is no majority element");
            }
        }
    }
