package DemoQueue;
public class NQueue {
    int[] Queue = new int[5];
    private static final int capacity = 5;
    private static int rear = 0;
    private static final int font = 0;

    private boolean isEmpty(){
        return (rear == font) ;
    }

    private boolean isFull(){
        return (rear == capacity);
    }

    public void enQueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else {
            Queue[rear] = data;
            rear++;
        }
    }

    public void deQueue(){
         if(isEmpty()){
             System.out.println("Queue is Empty");
         }
         else {
             // shift elements to the right by one place until rear
             if (rear - 1 >= 0)
                 System.arraycopy(Queue, 1, Queue, 0, rear - 1);
             if (rear < capacity)        // set queue[rear] to 0
                 Queue[rear] = 0;

             rear--;
         }
    }

    public void show(){
        System.out.print("Element : ");
        for(int i=0; i<rear; i++){
            System.out.print(Queue[i]+" ");
        }
    }
}
