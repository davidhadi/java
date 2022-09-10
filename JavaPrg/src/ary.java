import java.util.Scanner;
class ary {
    public static void main(String[] args){
        int target,n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of araay :");
             n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter Target :");
             target = sc.nextInt();
        System.out.println("Enter"+n+ " Number");
        for (int i = 0; i < n; i++) {
               num[i] = sc.nextInt();
            }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(num[i] + num[j] == target){
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }
}
