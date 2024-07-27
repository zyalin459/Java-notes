package set_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
public class HashSet_ {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        System.out.println(hashSet.add("john"));
        System.out.println(hashSet.add("lucy"));
        System.out.println(hashSet.add("lucy"));
        System.out.println(hashSet.add(new Dog("tom"))); // ok
        System.out.println(hashSet.add(new Dog("tom"))); // ok, another object
        System.out.println(hashSet.add("rose"));

        hashSet.remove("john");
        System.out.println("set=" + hashSet);

        hashSet.add(new String("hsp")); // ok
        hashSet.add(new String("hsp")); // No
        System.out.println("set=" + hashSet);
    }
}
class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{name:" + name +"}";
    }
}



