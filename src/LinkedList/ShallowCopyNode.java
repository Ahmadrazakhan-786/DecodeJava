package LinkedList;

public class ShallowCopyNode {
    public static void main(String[] args) {
        Node a = new Node(100);
        System.out.println(a.val);

        Node temp = a; // shallow copy: koi naya node nhi bna hai
        System.out.println(temp.val);

//         proof: both will give same Gb values
//        System.out.println(a);
//        System.out.println(temp);
    }
}
