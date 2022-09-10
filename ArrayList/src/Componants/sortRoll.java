package Componants;

import java.util.Comparator;

public class sortRoll implements Comparator<Student>{

    @Override
    public int compare(Student e1, Student e2) {
        if(e1.getRoll() > e2.getRoll()){
            return 1;
        } else {
            return -1;
        }
    }
}
