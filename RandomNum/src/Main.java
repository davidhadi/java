import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int i = 0;
        while( i<10){
            System.out.println(""+rand.nextInt(500));
            i++;
        }
    }
}
