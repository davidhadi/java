class Table{
    synchronized void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class A extends Thread{
    Table t1;
    A(Table t1){
       this.t1 = t1;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
        t1.printTable(5);
//      for(int i = 1; i<=5; i++){
//          if(i==1) yield();
//          System.out.println("\t From thread A : i ="+i);
//      }
//      System.out.println("Exit from A");
    }
}
class B extends Thread{
    Table t2;
    B(Table t2){
        this.t2 = t2;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
        t2.printTable(10);
//        for(int j = 1; j<=5; j++){
//            System.out.println("\t From thread B : j ="+j);
//            if(j==3) stop();
//        }
//        System.out.println("Exit from B");
    }
}
class C extends Thread{
    Table t3;
    C(Table t3){
        this.t3 = t3;
    }
    public void run(){
        t3.printTable(6);
//        for(int k = 1; k<=5; k++){
//            System.out.println("\t From thread C : k ="+k);
//            if(k==1){
//                try{
//                    sleep(1000);
//                }
//                catch (Exception e){
//
//                }
//            }
//        }
//        System.out.println("Exit from C");
    }
}


class D extends Thread{
    Table t4 = new Table();
    public void run(){
        t4.printTable(11);
    }
}
public class ThreadMethods {
    public static void main(String[] args){

        Table tab1 = new Table();

        A threadA = new A(tab1);
        B threadB = new B(tab1);
        C threadC = new C(tab1);
        D threadD = new D();
        System.out.println("Start thread A");
        threadA.start();
        System.out.println("Start thread B");
        threadB.start();
        System.out.println("Start thread C");
        threadC.run();
//        System.out.println("Start thread C");
//        threadD.start();
        System.out.println("End of main thread !");
    }
}