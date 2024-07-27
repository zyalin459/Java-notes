package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(new Dog("Kk", 2));
        list.add(new Dog("Mm", 0.3));
        list.add(new Dog("Yy", 1));

        System.out.println("使用迭代器");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println("dog= " + dog );
        }

        System.out.println("使用增强for");
        for (Object dog :list) {
            System.out.println("Dog= " + dog);
        }
    }

    static class Dog {
        private String name;
        private double age;
        public Dog(String name, double age) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Name: " + name + " Age: " + age;
        }
    }

}
