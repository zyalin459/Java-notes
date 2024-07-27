package set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("john");
        set.add("mary");
        set.add("jack");
        set.add(null);
        set.add(null);
        set.add("zack");
        set.add("abby");
        System.out.println("Set= " + set);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj= " + obj);
        }

        System.out.println("============");
        for (Object o : set) {
            System.out.println("o= " + o);
        }

        set.remove(null);
        System.out.println("Set= " + set);
    }
}
