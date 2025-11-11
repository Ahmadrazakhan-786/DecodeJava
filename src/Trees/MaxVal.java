package Trees;
class Nodess{
    int val;
    Nodess left;
    Nodess right;
    Nodess(int val){
        this.val = val;
    }
}
public class MaxVal {
    public static void display(Nodess root){
        if (root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    public static int max(Nodess root){
        if (root==null) return Integer.MIN_VALUE;
//        Agar current node null milta hai, iska matlab yaha koi value nahi hai.
//        Maximum ke comparison me koi effect na pade, isliye hum Integer.MIN_VALUE return kar dete hain
//        (ye sabse chhoti integer value hoti hai).
        int max = Math.max(root.val, Math.max(max(root.left),max(root.right))); //isme 3 chezo ko comapare kara
        return max; // gya hai root,root.left,root.right pehle left aur right ko kara gya fir undono ko root se kar
    }
    public static int min(Nodess root){
        if (root==null) return Integer.MAX_VALUE;
        int min = Math.min(root.val, Math.min(min(root.left),min(root.right)));
        return min;
    }
    public static int size(Nodess root){
        if (root == null) return 0;
        int size = 1 + size(root.left) + size(root.right);
        return size;
    }
    public static void main(String[] args) {
        Nodess a = new Nodess(1);
        Nodess b = new Nodess(4);
        Nodess c = new Nodess(-3);
        Nodess d = new Nodess(2);
        Nodess e = new Nodess(6);
        Nodess f = new Nodess(5);
        a.left = b; b.left = d;
        b.right = e; a.right = c;
        c.right = f;

        display(a);
        System.out.println();
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(size(a));
    }
}
