package String;

public class String01 {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'j', 'a'};
    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        String01 ex = new String01();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
    }
}
