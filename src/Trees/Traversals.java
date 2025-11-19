package Trees;

import java.util.LinkedList;
import java.util.Queue;

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
        // postorder: left -> right -> root
    }
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        if (root!=null) q.add(root); // q ke under sabse pehle root push kar diya
        while (q.size()>0){
            Node front = q.remove(); // jo q me front pe hai usko nikal kar kahi pe store kar lo
            System.out.print(front.val + " "); // fir jisko pop kara usko print kar do
            if (front.left!=null) q.add(front.left); // fir uske baad jo front ele hai
//            if (front.right!=null) q.add(front.right); // uske left aur right child ko q me add kar diya
        }
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
        System.out.print("Preorder: ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder: ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder: ");
        postorder(a);
        System.out.println();
        System.out.print("Level Order: ");
        levelOrder(a);
        System.out.println();
    }
}
