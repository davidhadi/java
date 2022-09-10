import java.util.*;

public class slsort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int n = sc.nextInt();
        int x[] = new int[n];
        System.out.println("Enter "+n+ "element :");
        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < n-1; i++){
            int id = i;
            for (int j = i+1; j < n; j++)
                if (x[j] < x[id])
                    id = j;

            int temp = x[id];
            x[id] = x[i];
            x[i] = temp;
        }
        System.out.println("Shorted number is :");
        for(int i=0; i<n; i++){
            System.out.print(" "+x[i]);
        }

    }

}
