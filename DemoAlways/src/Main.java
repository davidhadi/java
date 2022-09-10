import java.util.*;
// ====================================Queue========================================
public class Main {
    int Queue[];
    int capacity = 5;
    int font = 0;
    int rear = 0;
   public Main(){

       Queue = new int[5];
    }
    public  void enQueue(int x){
         if(rear == capacity){
             System.out.println("Queue if teporarily full");
         }
         else{
             Queue[rear]= x;

             rear++;
         }

    }
    public void deQueue(){
        if(rear == font){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=0; i<rear-1; i++){
                Queue[i] = Queue[i+1];
            }
            if(rear < capacity){
                Queue[rear] = 0;
            }
            rear--;
        }
    }

    public void show(){
        System.out.println("Data is : ");
        for(int i=0; i<rear; i++){
            System.out.print(" "+Queue[i]);
        }
    }
//==================================================stack===============================================
    int stack[] = new int[5];
    int max_size = 5;
    int left =0;
    int right = 0;
    public void push(int x){
        if(right == max_size){
            System.out.println("\n Stack is full");
        }
        else{
            for(int i=max_size-1; i>=1; --i){
                stack[i] = stack[i-1];
            }
            stack[0]= x;
            right++;
        }
    }
    
    public void pop() {
        if (rear == left) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i < max_size-1; i++) {
                stack[i] = stack[i+1];
            }
            right--;
        }
    }
    public void showStack(){
        System.out.println("\n Data of stack is : ");
        for(int i=0; i<right; i++){
            System.out.print(" "+stack[i]);
        }
    }
// ==========================================================================================================
   public void stringtest(){
       String s = "I am a beautiful String";
       String f = "String";
       if(s.indexOf(f) == -1)
           System.out.println("String not found");
       else
           System.out.println("index: "+s.indexOf(f));


   }
   public void checkNum(int n){
       // int x = n;
        boolean odd = (n % 2) == 1;
        System.out.println(odd);

       boolean Odd = (n & 1) != 0;
       System.out.println("New result : "+odd);

   }
   public void sumNum(int n){
        int sum = n * (n+1)/2;
        System.out.println(sum);
   }
   public void DecimalToBinary(int x){
        String bit = Integer.toBinaryString(x);
        System.out.println(bit);
   }
//==================================== Tree ==========================================================
    static class Node {
        int value;
        Node left, right;

        Node(int value){
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            }
            else {
                System.out.println(" Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        }
        else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            }
            else {
                System.out.println("  Inserted " + value + " to right of " + node.value);
                node.right = new Node(value);
            }
        }
    }
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
//==================================== End of tree =====================================================
public static void main(String[] args){

        Main Q = new Main();
        Q.enQueue(9);
        Q.enQueue(8);
        Q.enQueue(89);
        Q.enQueue(54);
        Q.deQueue();
        Q.deQueue();
        Q.enQueue(65);
        Q.enQueue(9);
        Q.enQueue(10);
        Q.enQueue(99);
        Q.push(56);
        Q.push(57);
        Q.push(58);
        Q.push(59);
        Q.pop();
        Q.push(69);
        // Q.show();
        // \u000d
        // Q.showStack();
         // Q.stringtest();
         //Q.checkNum(6);
        //Q.sumNum(100);
         // Q.DecimalToBinary(4);

//=================================== tree call ================================================
    Main tree = new Main();
    Node root = new Node(5);
    System.out.println("Binary Tree Example");
    System.out.println("Building tree with root value " + root.value);
    tree.insert(root, 2);
    tree.insert(root, 4);
    tree.insert(root, 8);
    tree.insert(root, 6);
    tree.insert(root, 7);
    tree.insert(root, 3);
    tree.insert(root, 9);
    System.out.println("Traversing tree in order");
  //  tree.traverseInOrder();

}
}
