package wrapper;

public class WrapperExercise {
    public static void main(String[] args) {
        // valueOf主要看 i 的范围，超过-128-127范围，才会new 一个object
        Integer i = Integer.valueOf(1);
        Integer j = Integer.valueOf(1);
        System.out.println(i == j);

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }
}
