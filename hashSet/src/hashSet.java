import Components.Employee;
import Components.sortSalary;

import java.util.*;

public class hashSet {
    public static void main(String[] args){
        Set<Employee> hs = new HashSet<Employee>();

        hs.add(new Employee("Shakil", 4500));
        hs.add(new Employee("David", 4000));
        hs.add(new Employee("Kaif", 3200));
        hs.add(new Employee("Hadi", 3900));

        System.out.println(hs);

        List<Employee> list = new ArrayList<>(hs);

        Collections.sort(list, new sortSalary());

        System.out.println(list);

    }
}
