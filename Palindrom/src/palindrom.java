class Solution {
    public boolean isPalindrome(int x) {

        int rev = 0;
        int num = x;

        if (x == 0) {
            System.out.println("palindrom");
        }
       // else if (x < 0) {
        //    System.out.println("Not palindrom");
       // }

        while (x > 0) {
            rev = rev * 10;
            rev = rev + x % 10;
            x = x / 10;
        }
        if (num == rev) {
            System.out.println("palindrom");
        }
        else {
            System.out.println(" Not palindrom");
        }
        return true;
    }
}
public class palindrom{
    public static void main (String[] args){
         Solution pal  = new Solution();
            pal.isPalindrome(1221);
    }
}
