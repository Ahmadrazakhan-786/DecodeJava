package Trees;
class Nodes{
    int val;
    Nodes left;
    Nodes right;
    Nodes(int val){
        this.val = val;
    }
}

public class ProductOfTreeNodes {
    private static void display(Nodes root){
        if (root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    private static int product(Nodes root){
        if (root == null) return 1; //Agar yeh node hai hi nahi, to iska multiplication me koi contribution nahi.
        //Multiplication me identity 1 hoti hai, isliye 1 return karte hain.

        if (root.val == 0) return product(root.left)*product(root.right); // product of non-zero nodes
        return root.val*product(root.left)*product(root.right);
    }
    public static void main(String[] args) {
        Nodes a = new Nodes(0);
        Nodes b = new Nodes(4);
        Nodes c = new Nodes(3);
        Nodes d = new Nodes(2);
        Nodes e = new Nodes(6);
        Nodes f = new Nodes(5);

        a.left = b; b.left = d;
        b.right = e; a.right = c;
        c.right = f;

        display(a);
        System.out.println();
        System.out.println(product(a));
    }
}
