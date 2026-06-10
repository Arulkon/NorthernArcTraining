package Module01.Day5.Arrays;

import java.util.Comparator;

public class FnameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1,Person o2){
        return o1.getFname().compareTo(o2.getFname());
    }
}
