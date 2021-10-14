import Components.Employee;
import Components.sortSalary;

import java.util.*;

public class hashSet {
    public static void main(String[] args){
        Set<Employee> hs = new HashSet<>();

        hs.add(new Employee("shakil", 4500));
        hs.add(new Employee("david", 4000));
        hs.add(new Employee("kaif", 3200));
        hs.add(new Employee("hadi", 3900));


        System.out.println(hs);

        List<Employee> list = new ArrayList<>(hs);

        Collections.sort(list, new sortSalary());

        System.out.println(list);

    }
}
