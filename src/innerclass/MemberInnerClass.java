package innerclass;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        // 外部其他类使用成员内部类的三种方式
        // 1 相当于把new Inner08()当作是outer08成员
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();

        // 2 在外部类，编写一个方法，可以返回 Inner08 对象
        Outer08.Inner08 inner08Instance = outer08.getInner01Instance();
        inner08Instance.say();

        // 3
        new Outer08().new Inner08();
    }
}

class Outer08{
    private int n1 = 10;
    public String name = "San";

    class Inner08 {
        private int n1 = 66;
        public void say() {
            System.out.println("Outer08's n1 = " + Outer08.this.n1 + " name = " + name + " 内部类的n1= " + n1);
        }
    }
    // 该方法返回一个Inner08对象
    public Inner08 getInner01Instance() {
        return new Inner08();
    }

    public void t1() {
        Inner08 inner08 = new Inner08();
        inner08.say();
    }

}
