package Methods;

import java.util.Scanner;

public class PandC {
    public static int fact(int x){
        int xfact = 1;
        for (int i=1; i<=x; i++){
            xfact *= i;
        }
        return xfact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
//        int nfact = 1;
//        for (int i=1; i<=n; i++){
//            nfact *= i;
//        }
//        int rfact = 1;
//        for (int i=1; i<=r; i++){
//            rfact *= i;
//        }
//        int n_rfact = 1;
//        for (int i=1; i<=n-r; i++){
//            n_rfact *= i;
//        }

        // using methods:
        int nfact = fact(n);
        int rfact = fact(r);
        int n_rfact = fact(n-r);
        int ncr = nfact/(n_rfact*rfact);
        System.out.println(ncr);
    }
}
