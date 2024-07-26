package Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("List = " + list);

//        list.remove(0);
        list.remove("jack");
        System.out.println(list);

        System.out.println(list.contains("jack"));

        System.out.println(list.size());

        System.out.println(list.isEmpty());

        list.clear();
        System.out.println(list);

        List list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println("Lits = " + list);
        System.out.println(list.containsAll(list2));
        list.clear();
        list.add("聊斋");
        System.out.println(list);
    }
}
