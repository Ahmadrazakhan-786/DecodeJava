package Arrays;

public class mergetwosortarray {
    public static void main(String[] args) {
        int[] a = {30, 42, 75, 80, 96,102,120,510};
        int[] b = {12, 72, 82, 95, 786};
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        // merging:
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if (i == a.length) { // now take element from b only
            while (j < b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
            if (j == b.length) { // now take element from a only
                while (i < a.length) {
                    c[k] = a[i];
                    j++;
                    k++;
                }
                for (int ele : c){
                    System.out.print(ele + " ");
                }
            }
        }
    }
}
