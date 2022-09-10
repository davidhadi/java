package Reading;
import java.io.DataInputStream;

public class Testt {
    DataInputStream in = new DataInputStream(System.in);
    int intNumber = 0;
    float floatNumber = 0.0f;
    public void getData(){
    try{
        System.out.println("Enter an Integer : ");
        intNumber = Integer.parseInt(in.readLine());
        System.out.println("Enter an Float Number : ");
        floatNumber = Float.valueOf(in.readLine()).floatValue();
    }
    catch(Exception e){
         System.out.println("Oops there is an error !");
    }
    }
    public void Show(){
        System.out.println("intNumber = " + intNumber);
        System.out.println("FloatNumber = " + floatNumber);
    }
}
