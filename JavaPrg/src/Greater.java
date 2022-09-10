import java.util.*;

public class Greater {
    public static void main(String[] args){

    while(true) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no for Checking greater : ");

       float x = sc.nextFloat();
       float y = sc.nextFloat();
       sc.close();
        if (x > y)
            System.out.println("Greater Number is : " + x);
        else
            System.out.println("Greater Number is : " + y);
    }
    }

}
