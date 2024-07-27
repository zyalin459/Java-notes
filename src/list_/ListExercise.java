package list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("cat");
        list.add("dog");
        list.add("egg");
        list.add("fall");
        list.add("gold");
        list.add("hook");
        list.add("ice");
        list.add("jelly");
        System.out.println("list= " + list);

        list.add(1, "韩顺平教育");
        System.out.println("list= " + list);

        System.out.println(list.get(4));

        list.remove(5);
        System.out.println("list= " + list);

        list.set(6, "oatmeal");
        System.out.println("list= " + list);

        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println("o = " + o);
        }
    }
}
