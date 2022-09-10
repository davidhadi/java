package Data;
import java.util.*;

class ArithProgression extends Progression{
    protected long inc;
    ArithProgression(){
        this(1);
    }
    ArithProgression(long increament){
        inc = increament;
    }
    protected long nextValue(){
        cur +=inc;
        return cur;
    }
}

class GeomProgression extends Progression{
    protected long base;

    GeomProgression(long b){
        base = b;
        first = 1;
        cur = first;
    }
    protected long nextValue(){
        cur *= base;
        return cur;
    }
}

class FibonacciProgression extends Progression{
    long prev;

    FibonacciProgression(){
        this(0,1);
    }
    FibonacciProgression(long value1, long value2){
        first = value1;
        prev = value2-value1;
    }
    protected long nextValue(){
        long temp = prev;
        prev = cur;
        cur += temp;
        return cur;
    }
}

class Main {
    public static void main(String[] args){
        Progression prog;
        System.out.println("Arithmatic progression with default base : ");
        prog = new ArithProgression();
        prog.printProgression(10);
        System.out.println("Arithmatic progression with increment 5 : ");
        prog = new ArithProgression(5);
        prog.printProgression(10);

        System.out.println("Geometric progression with default base : ");
        prog = new ArithProgression();
        prog.printProgression(10);
        System.out.println("Geometric progression with increment 5 : ");
        prog = new ArithProgression(3);
        prog.printProgression(10);

        System.out.println("Fibonacci progression with default start values : ");
        prog = new FibonacciProgression();
        prog.printProgression(10);
        System.out.println("Arithmatic progression with increment 5 : ");
        prog = new FibonacciProgression(4,6);
        prog.printProgression(10);
    }
}
