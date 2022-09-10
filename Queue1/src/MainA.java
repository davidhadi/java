import java.util.*;

class Queue{
    private static int front, rear, capacity;
    private static int queue[];

    Queue(int size){
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }
    // insert an element into the queue
    static void queueEnqueue(int item){
        if (capacity == rear){
            System.out.println("\nQueue is full\n");
        }
        else {
            queue[rear] = item;
            rear++;
        }
    }


    static void queueDequeue(){
        if (front == rear) {
            System.out.println("\nQueue is empty\n");
        }

        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
             if (rear < capacity)
                queue[rear] = 0;

            rear--;
        }
    }

    static void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.println("Queue is Empty\n");
        }

        for (i = front; i < rear; i++) {
            System.out.printf(" %d = ",queue[i]);
        }
    }


    static void queueFront(){
        if (front == rear) {
            System.out.println("Queue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element of the queue: %d", queue[front]);
    }
}

public class MainA {
    public static void main(String[] args) {
        Queue q = new Queue(4);

        System.out.println("Initial Queue:");

        q.queueDisplay();

        q.queueEnqueue(10);
        q.queueEnqueue(30);
        q.queueEnqueue(50);
        q.queueEnqueue(70);


        System.out.println("Queue after Enqueue Operation:");
        q.queueDisplay();

        q.queueFront();

        q.queueEnqueue(90);

        q.queueDisplay();

        q.queueDequeue();
        q.queueDequeue();
        System.out.println("\nQueue after two dequeue operations:");


        q.queueDisplay();


        q.queueFront();
    }
}