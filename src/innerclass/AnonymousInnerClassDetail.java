package innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}

class Outer05 {
    private int n1 = 99;
    public void f1() {
        new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法");
            }
        }.hi();
    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");
    }
}