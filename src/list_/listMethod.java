package list_;

import java.util.ArrayList;
import java.util.List;

public class listMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("jack");
        list.add("Mary");
        list.add(1, "Link");
        System.out.println("list= " + list);

        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1,list2);
        System.out.println("list= " + list);

        System.out.println(list.indexOf("jack"));
        System.out.println(list.lastIndexOf("jack"));

        list.remove(2);
        System.out.println("list= " + list);

        // 替换
        list.set(0,"Jack");
        System.out.println("list= " + list);

        // 左闭右开
        List returnList = list.subList(0,2);
        System.out.println(returnList);
    }
}
