package Components;

import java.util.Comparator;

public class sortByKey implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int n1 = (Integer)o1;
        int n2 = (Integer)o2;
        return n2 > n1 ? -1 : 1;
    }
}
