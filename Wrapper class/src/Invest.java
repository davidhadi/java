import java.io.*;
class Invest {
    public static void main(String args[]){
        Float principalAmount = new Float(0);   //Converting number to objects

        Float interestRate = new Float(0);
        int numYears = 0;
        try{
           DataInputStream in = new DataInputStream(System.in);
           System.out.println("Enter Principal Amount : ");
           System.out.flush();
            String principalString = in.readLine();
            //principalAmount = in.readFloat();
            principalAmount = Float.valueOf(principalString);  //String object to number object

            System.out.println("Enter Interest Rate : ");
            System.out.flush();
            String interestString = in.readLine();
            //interestRate = in.readFloat();
            interestRate = Float.valueOf(interestString);  //String object to number object

            System.out.println("Enter Number of year : ");
            System.out.flush();
            String yearString = in.readLine();
            //numYears = in.readInt();
            numYears = Integer.parseInt(yearString);  //String object to number object

        }
        catch(IOException e){
            System.out.println("Oops I/O Error");
            System.exit(1);
        }
        float value = loan(principalAmount.floatValue(), interestRate.floatValue(), numYears);
        printline();
        System.out.println("Final Value = "+value);
        printline();
    }

    // Method to compute Final Value

    static float loan (Float p, float r, int n){
        int year = 1;
        float sum = p;
        while ( year <= n){
            sum = sum + (1 + r);
            year = year +1;
        }
        return sum;
    }
   // method to draw a line
     static void printline(){
       for(int i=1; i <= 30; i++){
          System.out.print("=");
         }
        System.out.println(" ");
    }
}
