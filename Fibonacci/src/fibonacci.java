public class fibonacci {
     int num=2;
     int i=0, j=1;
    public void fibbo(int n){
        System.out.print(i+" "+j);
        while(num<n){
            int x = i + j;
            i = j;
            j = x;
            System.out.print(" "+x);
            num++;
        }
    }
    public static void main(String[] args){
        fibonacci fib = new fibonacci();
          fib.fibbo(15);
    }
}
