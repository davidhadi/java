import DemoQueue.NQueue;
public class Queue{
    public static void main(String[] args){
        NQueue Q = new NQueue();
          Q.enQueue(5);
          Q.enQueue(2);
          Q.enQueue(9);
          Q.enQueue(10);
          Q.enQueue(20);
          Q.enQueue(12);
          Q.deQueue();
          Q.enQueue(77);

          Q.show();
        System.out.println();
    }
}
