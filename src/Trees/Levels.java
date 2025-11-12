package Trees;
class Nodewa{
    int val;
    Nodewa left;
    Nodewa right;
    Nodewa(int val){
        this.val = val;
    }
}

public class Levels {
    public static void display(Nodewa root){
        if (root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    public static int levels(Nodewa root){
        if (root == null) return 0;
        // M-1:
//        if (levels(root.left) > levels(root.right)){
//            return 1 + levels(root.left);
//        }else{
//            return 1 + levels(root.right);
//        }
        return 1+ Math.max(levels(root.left), levels(root.right));
    }
    public static int height(Nodewa root){
        if (root==null) return 0;
        int levels = 1 + Math.max(levels(root.left), levels(root.right));
        return levels-1;
    }
    public static void main(String[] args) {
        Nodewa a = new Nodewa(1);
        Nodewa b = new Nodewa(4);
        Nodewa c = new Nodewa(3);
        Nodewa d = new Nodewa(2);
        Nodewa e = new Nodewa(6);
        Nodewa f = new Nodewa(5);

        a.left = b; b.left = d;
        b.right = e; a.right = c;
        c.right = f;

        display(a);
        System.out.println();
        System.out.println(levels(a));
        System.out.println(height(a));

    }
}
