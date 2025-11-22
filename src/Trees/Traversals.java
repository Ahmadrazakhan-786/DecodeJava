package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Traversals {
    static int n; // global var for nth-level
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
//    public static void levelOrder(Node root){
//        Queue<Node> q = new LinkedList<>();
//        if (root!=null) q.add(root); // q ke under sabse pehle root push kar diya
//        while (q.size()>0){
//            Node front = q.remove(); // jo q me front pe hai usko nikal kar kahi pe store kar lo
//            System.out.print(front.val + " "); // fir jisko pop kara usko print kar do
//            if (front.left!=null) q.add(front.left); // fir uske baad jo front ele hai
//            if (front.right!=null) q.add(front.right); // uske left aur right child ko q me add kar diya
//        }
//    }
public static void levelOrder(Node root){ // TC = O(n) , SC = O(n)
     int prevlevel = 0;
    Queue<Pair> q = new LinkedList<>();
    Pair p = new Pair(root, 0);
    if (root!=null) q.add(p); // q ke under sabse pehle root push kar diya
    while (q.size()>0){
        Pair front = q.remove(); // jo q me front pe hai usko nikal kar kahi pe store kar lo
        Node temp = front.node;
        int lvl = front.level;
        if (lvl!=prevlevel){
            System.out.println();
            prevlevel++;
        }
        System.out.print(temp.val + " "); // fir jisko pop kara usko print kar do
        if (temp.left!=null) q.add(new Pair(temp.left,lvl+1)); // fir uske baad jo front ele hai
        if (temp.right!=null) q.add(new Pair(temp.right,lvl+1)); // uske left aur right child ko q me add kar diya
    }
}

    public static void nthlevelEle(Node root, int level ){
        if (root==null) return;
        if (level == n) System.out.print(root.val + " ");
        nthlevelEle(root.left,level+1);
        nthlevelEle(root.right,level+1);
    }


    public static void main(String[] args) {
        Node a = new Node(1); // root node is a here
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; f.right = i;

        System.out.print("Preorder: ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder: ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder: ");
        postorder(a);
        System.out.println();
        System.out.println("Level Order: ");
        levelOrder(a);
        System.out.println();

//        for(int j=0; j<=3; j++){ // Level order: using DFS
//            n = j;
//            nthlevelEle(a,0);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
         n = sc.nextInt();

        nthlevelEle(a,0); // root aur level bheza hai

    }
    public static class Pair{ // for nth-level order
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
}
