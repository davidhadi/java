class Main {
    public static void reverse(String str){
        String string = str;
        int n = string.length();
        for(int i=n-1; i>=0; i--){
            System.out.print(string.charAt(i));
        }
      System.out.println();
    }
    public static void reverseInt(int x){
        int num = x;
        int number=0 ;
        while(num!=0){
            int nm = num%10;
                number = number*10 + nm;
                num = num / 10;
        }

        System.out.println(number);
    }
    public static void main(String args[]){
        String str  = "David shakil";
        reverse(str);
        reverseInt(654);
    }
}
