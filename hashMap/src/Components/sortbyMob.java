package Components;

import Components.PhoneBook;

import java.util.Comparator;

public class sortbyMob implements Comparator<PhoneBook> {

    @Override
    public int compare(PhoneBook e1, PhoneBook e2){
        return e1.getNumber().compareTo(e2.getNumber());
    }
}
