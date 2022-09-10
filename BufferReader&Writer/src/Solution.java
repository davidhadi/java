import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.time.LocalDate;

class result{
    public static String findDay(int month, int day, int year){
        return LocalDate.of(month, day, year).getDayOfWeek().name();
    }
}
public class Solution {
    public static void main(String[] args){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+&", "").split(" ");

            int month = Integer.parseInt(firstMultipleInput[0]);
            int day = Integer.parseInt(firstMultipleInput[1]);
            int year = Integer.parseInt(firstMultipleInput[2]);

            String res = result.findDay(month, day, year);

            bufferedWriter.write(res);
            bufferedWriter.write("hi david");
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
        catch (Exception e){}
    }
}
