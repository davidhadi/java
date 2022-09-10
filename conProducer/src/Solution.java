import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;

class Producer extends Thread {

    List<Integer> llist;

    Producer()
    {
        llist = new ArrayList<Integer>(10);
    }

    public void run()
    {
        while (true) {
            synchronized (llist) {
                for (int i = 0; i < 10; i++) {
                    try {
                        llist.add(i);
                        System.out.println("Produced " + i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("list is FUll");
                llist.notify();
            }
        }
    }
}
class Consumer extends Thread {

    Producer p;
    Consumer(Producer temp)
    {
        p = temp;
    }

    public void run()
    {
        while(true) {
            synchronized (p.llist) {
                try {
                    p.llist.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println(p.llist.size());

                for (int i = 0; i < p.llist.size(); i++) {
                    System.out.println(p.llist.remove(i));
                }

                System.out.println(p.llist);
                if (p.llist.size() == 0)
                    System.out.println("List is Empty !");
            }
        }
    }
}

public class Solution {
    public static void main(String args[])
    {
        Producer p = new Producer();
        Consumer c = new Consumer(p);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t2.start();
        t1.start();
    }
}
