package innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();

        // 外部其他类使用静态内部类
        // 1
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        // 2 编写一个方法,可以返回静态内部类
        Outer10.Inner10 inner101 = outer10.getInner10();
        System.out.println("============");
        inner101.say();

        Outer10.Inner10 inner10_ = Outer10.getInner10_();
        System.out.println("********");
        inner10_.say();
    }
}
class Outer10 {
    private int n1= 10;
    private static String name = "张三";
    // Inner10 就是静态内部类
    // 1. 放在外部类的成员位置
    // 2. 使用static修饰
    // 3.
    // 4. 可添加访问修饰符
    // 5. 作用域：同其他成员，为整个类体
    static class Inner10{
       public void say() {
           System.out.println(name);
       }
    }
    public static void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }
    public Inner10 getInner10() {
        return new Inner10();
    }
    public static Inner10 getInner10_() {
        return new Inner10();
    }
}

