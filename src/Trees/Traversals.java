package Trees;

public class Traversals {
    public static void preorder(Node root){
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
        // preorder: root -> left -> right
    }
    public static void inorder(Node root){
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
        // inorder: left -> root -> right
    }
    public static void postorder(Node root){
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
        // inorder: left -> right -> root
    }
    public static void main(String[] args) {
        Node a = new Node(1); // root node is a here
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
    }
}
