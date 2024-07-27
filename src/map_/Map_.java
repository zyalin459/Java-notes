package map_;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

@SuppressWarnings("all")
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超","孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");

        // 1. 先取出所有的key，通过key取出对应的value
        // (1) 增强for
        Set keyset = map.keySet();
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }
        System.out.println("=============");
        // （2） 迭代器
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-" + map.get(key));
        }
        System.out.println("=============");


        // 2. 把所有values取出
        Collection values = map.values();
        // 这里可以使用所有Collections使用的遍历方法
        //（1）增强for
        for (Object value : values) {
            System.out.println(value);
        }
        System.out.println("=============");
        // （2）迭代器
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }
        System.out.println("=============");


        // 3. 通过entrySet获取K-V
        Set entrySet = map.entrySet(); // EntrySet<Entry<K,V>>
        // （1）增强for
        for (Object entry : entrySet) {
            // 将entry转成Map.entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m);
        }
        // （2） 迭代器
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry =  iterator2.next();
//            System.out.println(next.getClass()); // HashMap$Node  -实现-> Map.Entry (getKey, getValue)
            // 向下转型 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }
    }


}
