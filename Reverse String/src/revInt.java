public class revInt {

    public static int rev(int x){
        int n = 0;
        while(x!=0){
            n = n*10+ x%10;
            x = x/10;
        }
        return n;
    }
    public static void main(String[] args){
        int x = rev(9556);
        System.out.println("Reverse integer is : "+ x);
    }
}
