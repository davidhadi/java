public class tree{
  static class Node{
    int value;
    Node left,right;
    
    Node(int value){
      this.value = value;
      left = null;
      right = null;
    }
  }
  public void insert(Node node, int value){
    if(value < node.value){
      if(node.left != null)
         insert(node.left, value);
      else
         node.left = new Node(value);
    }
    else{
        if(node.right != null)
          insert(node.right, value);
        else
          node.right = new Node(value);
     }
  }
  public void show(Node node){
     if(node != null){
       show(node.left);
       System.out.print(" "+ node.value);
       show(node.right);
       }
  }
  public static void main(String[] args){
    tree t = new tree();
    Node node = new Node(6);
    System.out.println("Tree structure is : ");
        t.insert(node, 8);
        t.insert(node, 5);
        t.insert(node, 4);
        t.insert(node, 9);
        t.insert(node, 10);
        t.insert(node, 1);
    
        t.show(node);
  
  }
}
