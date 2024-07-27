package set_;

import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("milan", 18, new Employee2.MyDate(2000, 8, 10)));
        hashSet.add(new Employee("smith", 28, new Employee2.MyDate(2000, 8, 10)));
        hashSet.add(new Employee("milan", 18, new Employee2.MyDate(2000, 8, 10)));
        System.out.println("hashSet: " + hashSet);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age, Employee2.MyDate myDate) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 重写哈希值函数
    // 如果name和age相同，则返回相同的hash值


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
