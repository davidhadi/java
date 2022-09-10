import RomanToDecimal.RTDecimal;
public class Main {
    public static void main(String args[])
    {
        RTDecimal ob = new RTDecimal();

        String str = "V";
        int num = ob.romanToDecimal(str);
        System.out.println("Integer form of Roman Numeral is "+ num);
    }
}
