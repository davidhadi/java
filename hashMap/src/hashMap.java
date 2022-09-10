import Components.PhoneBook;
import Components.sortByKey;

import java.util.*;

public class hashMap {
    public static void main(String[] args){
        Map<String, String> phonebook = new HashMap<>();

        Map<Integer, PhoneBook> ph = new HashMap<>();

        ph.put(1, new PhoneBook("Shakil", "9525178942"));
        ph.put(2, new PhoneBook("ankit", "9525178742"));
        ph.put(3, new PhoneBook("david", "9525186942"));
        ph.put(4, new PhoneBook("hadi", "9115178942"));
        ph.put(5, new PhoneBook("Sunidhi", "9525178992"));

        phonebook.put("Shakil", "David");
        phonebook.put("Hadi", "Sunidhi");
        System.out.println("phonebook "+phonebook);

        Iterator itr = ph.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("phonebook "+ph);

        Set<Integer> keys = ph.keySet();
        for(Object i : keys)
            System.out.println(i+ " : "+ph.get(i));

        Set<Map.Entry<Integer, PhoneBook>> value = ph.entrySet();
        for(Map.Entry<Integer, PhoneBook> e : value)
            System.out.println(e.getKey()+" : "+e.getValue());
        System.out.println(value);

        List<Map.Entry<Integer, PhoneBook>> entryCustomerList = new ArrayList<>(ph.entrySet());

        System.out.println(entryCustomerList);
        System.out.println("A".compareTo("2"));

        Comparator<? super Integer> sortByKey;
        TreeMap<Integer, String> tree = new TreeMap<Integer, String>(new sortByKey());

        tree.put(101,"Shakil");
        tree.put(104, "shivam");
        tree.put(103, "alakh");
        tree.put(102, "gautam");

        System.out.println(tree);
    }
}
