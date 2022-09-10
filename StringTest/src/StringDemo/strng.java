package StringDemo;

public class strng {
    String S2,tr;
    String s1,up, rep;
    char c;

    public void getData(String s){
        S2 = s;
    }
    public void lower(){
        s1 = S2.toLowerCase();
    }
    public void upper(){
        up = S2.toUpperCase();
    }
    public void replace(){
        rep = S2.replace('v', 'b');
    }
    public void trim(){
        tr = S2.trim();
    }
    public void Ch(){
        c = S2.charAt(3);
    }
    public void show(){
        System.out.println("Enter String is : " +S2 );
        System.out.println("Lower Case : " +s1 );
        System.out.println("Upper Case : " +up );
        System.out.println("Edited Name : " +rep );
        System.out.println("Trimmed Name : " +tr );
        System.out.println("character : " +c );
    }
}
