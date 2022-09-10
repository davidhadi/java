package sArray;

import java.util.Scanner;

public class StrAr {
    String[] itemArray = new String[5];
     Scanner sc = new Scanner(System.in);

     public void getdata(){
         System.out.println("Enter 5 string : ");
         for(int i=0; i<5; i++){
             itemArray[i] = sc.next();
         }

     }
     public void show(){
         System.out.println("Entered String Are : ");
         for(int i=0; i<5; i++){
             System.out.print(" "+ itemArray[i]);
         }
     }
}
