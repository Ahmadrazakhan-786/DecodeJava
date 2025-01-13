package TwoDimensionalArray;

public class forEachin2D {
    public static void main(String[] args) {

        // 1-D array:
        int[] a = {5,7,8};
        for (int ele : a){
            System.out.print(ele + " ");
        }
        System.out.println();
        
        // 2-D array:
        int[][] b = {{6,7,8},{3,6,9}};
        for (int[] ele: b){
            for (int x: ele){
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    }
}
