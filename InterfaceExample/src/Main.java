
interface Test {
    float m=11;
    void calculate(float x, float y);
    void show();
}
class A implements Test{
    float total;
    @Override
    public void calculate(float x, float y) {
        total = x*y;
    }

    @Override
    public void show() {
        System.out.println("Area : " + total);
    }
}
class B extends A {

    @Override
    public void show() {
       System.out.println("Area of circle : "+ m*m);
    }
}
public class Main {
    public static void main(String[] args){
         A at = new A();
         A bt = new B();
           at.calculate(10, 10);
           at.show();
           bt.show();
    }
}
