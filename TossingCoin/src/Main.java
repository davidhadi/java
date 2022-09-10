public class Main {
    static boolean toss(){
        return (Math.random()<0.5);
    }
    public static void main(String[] args){
         if(toss())
             System.out.println("Head");
         else
             System.out.println("Tail");
    }
}
