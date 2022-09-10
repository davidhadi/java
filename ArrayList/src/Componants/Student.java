package Componants;

public class Student {
    private int roll;
    private String name;

    public Student(int n, String s){
        this.roll = n;
        this.name = s;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Roll: "+this.roll+" Name: "+this.name;
    }
}
