package StringToInt;

public class StringToInt {
    int sum;
   public void calculate(String s, int x) {
        int inum2 = Integer.parseInt(s);
        sum  = x + inum2;
    }
   public void show() {
        System.out.println("Result is: "+sum);
    }
}
