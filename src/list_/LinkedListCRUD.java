package list_;

import java.util.Iterator;
import java.util.LinkedList;

@SuppressWarnings("all")
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("LinkedList= " + linkedList);

        linkedList.remove();
        linkedList.add(999);
        System.out.println("LinkedList= " + linkedList);

        System.out.println(linkedList.get(2));

        System.out.println("===遍历===");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("Next= "+next);
        }

        System.out.println("=======");
        for (Object o : linkedList) {
            System.out.println("Next= " + o);
        }
    }
}
