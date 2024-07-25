package wrapper;

public class WrapperType {
    public static void main(String[] args) {
        // 手动装箱
        int n1 = 100;
        Integer integer = Integer.valueOf(n1);

        // 手动拆箱
       int i = integer.intValue();

       // jdk5 以后，就可以自动装箱和自动装箱
        int n2 = 200;
        // 自动装箱
        Integer integer2 = n2; // 底层是 Integer integer2 = Integer.valueOf(n2);
        // 自动拆箱 Integer -> int
        int n3 = integer2; // 底层仍然是 integer.intValue();
    }
}
