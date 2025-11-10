package Trees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class NodeofTree {
    public static void main(String[] args) {
        Node a = new Node(1); // root node is a here
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        Node g = new Node(10);
        Node h = new Node(20);

        c.left = g;
        e.right = h;

//        a.left = null; // left subtree ka connection tod diya

//        System.out.println(b.val); // 4
//        System.out.println(a.left.val); // 4
//        System.out.println(e.val); // 6
//        System.out.println(a.left.right.val); // 6

        display(a);// root node pass kar diya
        System.out.println();
//        a.left = null;
        System.out.println(sum(a)); // iska matlab root node se jo tree bnta hai  uska sum
    }
    private static void display(Node root){
        if (root==null) return; // base case
        System.out.print(root.val + " ");// khud ki value print kardi
        display(root.left); // recursion ki help se left subtree display ho jaega
        display(root.right);// recursion ki help se right subtree display ho jaega
    }
    private static int sum(Node root){
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
}
