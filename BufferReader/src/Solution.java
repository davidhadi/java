import java.io.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class Solution {
    public static void main(String[] args){
        try{
            BufferedWriter write = new BufferedWriter(new FileWriter("output.txt"));
             write.write("hello david");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             String[] st = reader.readLine().split(" ");
             for(String stt : st)
                 write.write("\n"+stt);

            reader.close();
            write.close();
            BufferedReader reader1 = new BufferedReader(new FileReader("output.txt"));
              String line;
             while((line = reader1.readLine()) != null ) {
                  System.out.println(line);
             }
            reader1.close();
        }
        catch(IOException e){
            System.out.println(" ");
        }
    }
}
