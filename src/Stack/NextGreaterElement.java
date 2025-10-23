package Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] res = new int[arr.length]; // naya arr bna diya

        for (int i=0; i<arr.length;i++){
            res[i] = -1; // agr next greater ele nhi mila then it will work
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]>arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i=0; i<res.length; i++){
            System.out.print(res[i] + " "); // TC = O(n^2)
        }
    }
}
