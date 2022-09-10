class Student {
    int rollNumber;
    void getNumber(int n){
        rollNumber = n;
    }
    void putNumber(){
        System.out.println("Roll No : "+rollNumber);
    }
}
class Test extends Student{
    float part1,part2;
    void getMarks(float m1, float m2){
        part1 = m1;
        part2 = m2;
    }
    void putMarks(){
        System.out.println("Marks obtained ");
        System.out.println("part1 = "+part1);
        System.out.println("part2 =  "+part2);
    }
}
interface Sport{
    float sportWt = 6.0F;
    void putWt();
}
class result extends Test implements Sport {
    float total;

    public void putWt() {
        System.out.println("Sports Wt = " + sportWt);
    }

    void display() {
        total = part1 + part2 + sportWt;
        putNumber();
        putMarks();
        putWt();
        System.out.println("Total score = " + total);
        String st = "hello moto how are you";
        System.out.println("Reverse word : "+(new StringBuilder(st).reverse().toString()));
        String[] words = st.split(" ");
        System.out.println("length : "+words.length+" "+words[2]);
        for (String w : words) {
            System.out.println(w);
        }
    }
}
class Hybrid {
    public static void main(String[] args){
        result Student1 = new result();
        Student1.getNumber(1234);
        Student1.getMarks(27.5F, 33.0F);
        Student1.display();
    }
}
