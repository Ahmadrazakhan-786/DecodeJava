package Sliding_Window;

public class GrumpyBookStore {
    public int maxSatisfied(int[] customers, int[] grumpy, int k) { // k->minutes
        int n = grumpy.length, i=0,j=k-1, unSatisfiedCount=0;
        int maxunSatisfied=0, a=i, b=j;
        for (int x=0; x<=j; x++){ // iska matlab hmne jitne log unSatisfied hai unke customer ka sum nikal liya
            if (grumpy[i]==1) unSatisfiedCount += customers[x];
        }
        while (j<n){ // sliding  window
            if (maxunSatisfied<unSatisfiedCount){ // pehla window ka kaam
                maxunSatisfied = unSatisfiedCount;
                a=i; b=j;
            }
            i++; j++;
            if (j<n && grumpy[j]==1) unSatisfiedCount += customers[j];
            if (grumpy[i-1]==1) unSatisfiedCount -= customers[i-1];
        }
        for (int x=a; x<=b; x++){
            grumpy[x] = 0;
        }
        int satisfied=0;
        for (int x=0; x<n; x++){
            if(grumpy[x]==0) satisfied += customers[i];
        }
        return satisfied;
    }
    public static void main(String[] args) {

    }
}
