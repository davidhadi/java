import Componants.Student;
import Componants.sortName;
import Componants.sortRoll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayList {
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        list.add(new Student(15,"shakil"));
        list.add(new Student(11,"abhishek"));
        list.add(new Student(10,"bunty"));
        list.add(new Student(14,"reyhan"));
        list.add(new Student(11,"abhishek"));

        Collections.sort(list, new sortRoll());
        System.out.println(list);

        Collections.sort(list, new sortName());
        System.out.println(list);
    }
}
