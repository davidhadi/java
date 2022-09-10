import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Solution {
    private static void conArrayList(String str){
        String[] ar = str.split(",");
        for(String x : ar){
            System.out.print(x+" ");
        }
        List l1  = new ArrayList(Arrays.asList(ar));
        System.out.println();
        System.out.println("array : "+l1);
    }

    public static void main(String[] args){
        String str = "99,95,25,17,89,42";
        conArrayList(str);
    }
}
