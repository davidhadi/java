import java.util.*;
public class Main {

    public static void main(String[] args){
        String Str[] = {"Arabic","Turky","Dubai","Saudi","Brazil"};
        int n = Str.length;
       String temp = null;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++) {
               if (Str[j].compareTo(Str[i]) < 0) {
                   temp = Str[i];
                   Str[i] = Str[j];
                    Str[j] = temp;
               }
            }
       }
        //Collections.sort(Str[]);
        System.out.println("New array is : ");
        for(int i=0; i<n; i++){
            System.out.print(" "+Str[i]);
            }
        }
    }

