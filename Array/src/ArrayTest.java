
import java.util.ArrayList;
import java.util.LinkedList;

class AryDemo{
   void printline(){
       System.out.print("<");
       for(int i=0; i<=30; i++){
           System.out.print("=");
       }
       System.out.print(">");
       System.out.println();
   }
}

public class ArrayTest {
    public static void main(String[] args){
        AryDemo dm = new AryDemo();
        LinkedList<String> list3= new LinkedList<>();
        ArrayList<String>  list1 = new ArrayList<>();
        ArrayList list2 = new ArrayList();
        list3.add("Gabrial");
        list3.add("Gabrial1");
        list3.add("Gabrial2");
        list3.add("Gabrial3");
        list3.add("Gabrial4");
        list3.remove(4);

        list1.add("David");
        list1.add("Varshu");
        list1.add("Hello world");
        list1.add("Daniel");
        list1.remove("David");

        list2.add(4);
        list2.add(2.2);
        list2.add('H');
        list2.add("Khan");

        list1.set(2, "shakil");
        dm.printline();
        System.out.println("Array List_1 : "+list1);
        System.out.println("Array List_2 : "+list2);
        System.out.println("Array List_3 : "+list3);
        list2.remove("Khan");
        dm.printline();
        System.out.println("Array List_2 : "+list2);
        dm.printline();
        if(list2.contains(2.23)){
            System.out.println("List1 contains ..");
        }
        else {
            System.out.println("No match found !!");
        }

        String name = list1.get(2);
        System.out.println("Index 2 of list1 contain :  "+name);

    }
}
