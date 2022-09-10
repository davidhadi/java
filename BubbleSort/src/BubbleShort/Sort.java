package BubbleShort;

import java.util.Scanner;

public class Sort {
        Scanner sc = new Scanner(System.in);
         int[] ar = new int[5];

    public void getdata(){
        System.out.println("Enter element of array :  ");
           for(int i = 0; i<5; i++){
               ar[i] = sc.nextInt();
           }
    }
    public void Cal(){
        for(int i=0; i<5; i++){
            for(int j=i+1; j<5; j++) {
                if (ar[i] > ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
    public void show(){
        System.out.println("Sorted number are :  ");
        for(int i = 0; i<5; i++){
            System.out.print(" " +ar[i]);
        }
    }
}
