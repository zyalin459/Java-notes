package map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1, new Employee("jack", 8000, 1));
        hashMap.put(2, new Employee("bob", 12000, 2));
        hashMap.put(3, new Employee("mary", 20000, 3));

        Set entrySet = hashMap.entrySet();
        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry) entry;
//            System.out.println(m.getValue().getClass());
            Employee e = (Employee)m.getValue();
//            System.out.println(e.getClass());
            if (e.getSalary() > 18000) {
                System.out.println(e);
            }
        }

        Set keySet = hashMap.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            Employee e = (Employee) hashMap.get(key);
            if (e.getSalary() > 18000) {
                System.out.println(e);
            }
        }
    }
}
class Employee {
    private String name;
    private int salary;
    private int id;

    public Employee(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}

