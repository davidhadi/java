import java.lang.String;

public class slit {
    public static void main(String args[]) {
        String strings = "99,42,55,81,79,64,22";
        String[] str = strings.split(",");

        int length = str.length;
        int i = 0;
        while(i < length){
            System.out.print(str[i]+" ");
            i++;
        }
    }
}