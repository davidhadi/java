package Pattern;
import java.util.*;
public class St {
    String str;
    int x=58;
    int y=95;
    public void show(String s){
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<i+1; j++){
                char c = s.charAt(j);
                System.out.print(" "+c);
            }
            System.out.println("");
        }
        System.out.println("Minimum Number is : "+Math.min(y,x));
    }
}
