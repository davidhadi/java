public class count{
    public void count(int ar[]){
        int i = 0;
        try{
            int temp = ar[i];
            int n = ar.length;
            while (i < n){
                int c = 0;
                while (temp == ar[i]){
                    c++;
                    i++;
                    if(i==ar.length)
                        break;
                }
                System.out.println("Number " + temp + " found : " + c);
                temp = ar[i];
                System.out.println("temp : "+temp);
            }
    }
    catch(IndexOutOfBoundsException e){ }
 }
    public static void main(String[] args){
        count ct = new count();
        int ar[] = {1,1,1,1,2,2,3,4,4,99,99,99,5,5};
        System.out.println("Array length"+ ar.length);
         ct.count(ar);
    }
}
