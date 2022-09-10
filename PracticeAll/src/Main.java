/* public class Main {
    public static String rev(String stt){
        return new StringBuilder(stt).reverse().toString();
    }

    public static void main(String[] args){
        String stt = rev("David hadi");
        System.out.println("Reverse string : "+stt);
    }
} */
public class Main implements Runnable{
    public static void main(String[] args) {
        Thread guruThread1 = new Thread("Guru1");
        Thread guruThread2 = new Thread("Guru2");
        guruThread1.start();
        guruThread2.start();
        System.out.println("Thread names are following:");
        System.out.println(guruThread1.getName());
        System.out.println(guruThread2.getName());
    }
    @Override
    public void run(){
        System.out.println("Name : ");
    }
}
