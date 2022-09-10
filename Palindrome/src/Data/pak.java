package Data;

import java.io.DataInputStream;

public class pak {
    DataInputStream in = new DataInputStream(System.in);
    int num = 0;
    try{

        System.out.println("Enter Number for checking palindrome : ");
            String principalString = in.readLine();
            num = Integer.parseInt(principalString);

    }
    catch(IOException e){
        System.out.println("Oops Somthing error !!");
        System.exit(1);
    }
}
