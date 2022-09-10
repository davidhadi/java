package perimeter;

public class perimeter {
    int length, breath;
    public perimeter(){
        length =0;
        breath = 0;
    }
    public perimeter(int x, int y){
        length = x;
        breath = y;
    }
   public void calculate(){
        int peri = 2*(length+breath);
        System.out.println("The perimeter of rectangle is :  "+peri);
    }
}
