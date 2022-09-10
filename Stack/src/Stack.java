public class Stack {
    private static int maxSize;
    private static int[] Arr;
    private static int top=0;
    private static int rear = 0;

    public Stack(int s) {
        maxSize = s;
        Arr = new int[maxSize];
    }
    public void push(int x) {
        if(!isFull()) {
        Arr[rear] = x;
           top = rear;
            rear++;
        }
        else{
            System.out.println("Stack is full Can't Enter date "+x);
        }
    }
    private void pop() {
       if(!isEmpty()){
           rear--;
       }
       else{
           System.out.println("Stack is empty !");
       }
    }
    private int peek() {
        if(!isEmpty())
            return Arr[top];
        else
            return 0;
    }
    private static boolean isEmpty() {
        return (rear == 0);
    }
    public static boolean isFull() {
        return (rear == maxSize);
    }
    public void show() {
        System.out.print("Element : ");
        for (int i = rear-1; i >= 0; i--) {
            System.out.print(Arr[i] + " ");
        }
    }
    public static void main(String[] args) {
       Stack Stack = new Stack(10);
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);
        Stack.push(50);
        Stack.push(60);
        Stack.push(70);
        Stack.push(80);
        Stack.push(90);
        Stack.push(91);
        Stack.push(92);
        Stack.push(100);
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.pop();
        Stack.push(1000);

        System.out.println("top element : "+Stack.peek());

        Stack.show();

    }
}