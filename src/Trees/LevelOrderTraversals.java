package Trees;

import java.util.LinkedList;
import java.util.Queue;
class Pair{ // for level-order line-wise
    Node node;
    int level;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}
public class LevelOrderTraversals {
    public static void levelOrder(Node root){ // simple level order
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
    }
    public static void levelOrderLinewise(Node root){
        Queue<Pair> q = new LinkedList<>();
        int currlvl = 0;
        q.add(new Pair(root,0));
        while (q.size()>0){
            Pair front = q.remove();
            if (front.level!=currlvl){ // important
                currlvl++;
                System.out.println();
            }
            System.out.print(front.node.val + " ");
            if(front.node.left!=null) q.add(new Pair(front.node.left, front.level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right, front.level+1));
        }
    }
    public static void main(String[] args) {
        Node a = new Node(3); // root node is a here
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        levelOrder(a); // 3 4 2 -1 1 6 9
        System.out.println();
        levelOrderLinewise(a);
    }
}
