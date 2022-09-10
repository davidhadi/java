import java.util.Scanner;

public class tree {

    static Scanner sc ;
    public static class Node{
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static Node creatTree(){
        Node root;

        int data = sc.nextInt();
        if(data == -1)
            return null;

        root = new Node(data);

        System.out.println("left data of : "+data);
        root.left = creatTree();

        System.out.println("right data of : "+data);
        root.right = creatTree();

        return root;
    }

    public static Node findParent(Node current, int data1, int data2){
        if(current == null || current.value == data1 || current.value == data2){
            return current;
        }

        Node left = findParent(current.left, data1, data2);
        Node right = findParent(current.right, data1, data2);

            if (right == null) {
                return left;
            }
            else if(left == null){
                return right;
            }
            else {
                return current;
            }
    }

    public static  void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.value+" ");
            inOrder(root.right);
        }
    }


    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = creatTree();

        inOrder(root);
        Node parent = findParent( root ,6,8);
        if(parent != null)
            System.out.println(" parent : "+ parent.value);
        else
            System.out.println(" parent not found ! ");
    }
}
