import java.util.*;
public class intToString{
      static String s;
   public static void Conversion(int n){
       s = String.valueOf(n);
       // s = Integer.ToString(n);
       // s = ""+n;
   }
 public static void main(String[] args){
     intToString tt = new intToString();
       tt.Conversion(5);
    System.out.println(" "+s);
  }
}
