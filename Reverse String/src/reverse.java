public class reverse {
    String st = "";

    // 1st method for string reverse
    public void rev(String stt, int n){
        for(int i=n; i>=0; i--){
            st = st + stt.charAt(i);
        }
    }
    public void show(){
        System.out.println("Reverse string is : "+st);
    }

    // 2nd method for reverse string
    public static String reve(String stt){
        return new StringBuilder(stt).reverse().toString();
    }

    public static void main (String[] args){
        reverse rev = new reverse();
        String string = ")idaH(likahS divaD";
        int n = string.length();
         rev.rev(string, n-1);
         // rev.show();

         String S = reve(string);
         System.out.println("Reverse string is : "+S);
    }
}
