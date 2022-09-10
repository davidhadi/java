public class Solution {

    static class Node{
        int value;
        Node left, right;

        Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static void addNode(Node node, int value){
        if(value < node.value){
            if(node.left != null)
                addNode(node.left, value);
            else
                node.left = new Node(value);
        }
        else{
            if(node.right != null)
                addNode(node.right, value);
            else
                node.right = new Node(value);
        }
    }

    public static void show(Node node){
        if(node != null){
            show(node.left);
            System.out.print(node.value+" ");
            show(node.right);
        }
    }

    public static void main(String[] args){
        Node root = new Node(5);
        addNode(root,5);
        addNode(root,4);
        addNode(root,8);
        addNode(root,11);
        addNode(root,1);

        show(root);
    }
}
