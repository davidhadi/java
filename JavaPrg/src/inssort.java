import java.util.*;

public class inssort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int n = sc.nextInt();
        int[] x = new int[n];
        System.out.println("Enter "+n+ "element :");
        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
        }

        for (int i = 1; i < n; ++i) {
            int temp = x[i];
            int j = i - 1;
            while (j >= 0 && temp < x[j]) {
                x[j + 1] = x[j];
                --j;
            }
            x[j + 1] = temp;
        }
        System.out.println("Shorted number is :");
        for(int i=0; i<n; i++){
            System.out.print(" "+x[i]);
        }

    }

}
