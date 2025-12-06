package Trees;

public class BasicsOfBST {
//    public static int maxBST(Node root){
//        if (root==null) return Integer.MIN_VALUE;
//        int max = Math.max(root.val,maxBST(root.right));
//        return max;
//    }
public static int maxBST(Node root){
    if (root==null) return Integer.MIN_VALUE;
    while(root.right!=null){
        root = root.right;
    }
    return root.val;
}
public static int minBST(Node root){
    if (root==null) return Integer.MAX_VALUE;
    while (root.left!=null){
        root = root.left;
    }
    return root.val;
}
    public static void main(String[] args) {
        Node a = new Node(10); // root node is a here
        Node b = new Node(5);
        Node c = new Node(15);
        Node d = new Node(2);
        Node e = new Node(8);
        Node f = new Node(12);
        Node g = new Node(19);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        maxBST(a);
        System.out.println(maxBST(a));
        minBST(a);
        System.out.println(minBST(a));
    }
}
