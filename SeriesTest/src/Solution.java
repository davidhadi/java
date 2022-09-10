import java.util.*;

class Solution{
    public static void main(String []args){
        int a=5;
        int b=3;
        int n=5;
        int result1=0;
        for(int i=1; i<=n; i++){
            int result=0;
            for(int j=0; j<i; j++){
                result = result + (int)(Math.pow(2,j)*b);
            }
            result1 = a + result;
            System.out.print(" "+result1);
        }
    }
}
