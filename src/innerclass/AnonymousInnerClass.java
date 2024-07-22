package innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 { // 外部类
    private int n1 = 10;
    public void method() { // 方法
        // 基于接口的匿名内部类
        // 1. 需求：想使用A接口，并创建对象
        // 2. 传统方式： 写一个类，实现该接口，并创建对象
        // 3. 但只想使用对象一次
        // 4. 可以使用匿名类简化
        // 5. tiger的编译类型（等号左边）是 A
        // 6. tiger的运行类型是 匿名内部类
        // 7. jdk底层在创建匿名内部类 Outer04$1，立即马上就创建了Outer$01实例，并且把地址返回给tiger
        // 8. 匿名内部类使用一次，就不能再使用
        A tiger = new A() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        System.out.println("tiger的运行类型 " + tiger.getClass());
        tiger.cry();


        // 基于类的匿名内部类
        Father father = new Father("Jack") {
            @Override
            public void test() {
                System.out.println("匿名类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型=" + father.getClass()); // Outer04$2
        father.test();

        // 基于抽象类的匿名内部类
        new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };

    }
}

interface A{ // 接口
    public void cry();
}

class Father{
    public Father(String name) {
    }
    public void test() {

    }
}

abstract class Animal { // 抽象类
    abstract void eat();
}