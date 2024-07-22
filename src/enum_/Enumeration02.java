package enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        Season2 fall = Season2.FALL;
        System.out.println(fall.name());
        System.out.println(fall.ordinal());
        // 从反编译可以看出values方法，返回Season2（）
        for (Season2 season : Season2.values()) {
             System.out.println(season);
        }
        // valueOf：将字符串转换成枚举对象，字符串必须为已有的常量名
        // 1. 根据
        Season2 fall1 = Season2.valueOf("FALL");
        System.out.println(fall == fall1);
        System.out.println(Season2.FALL.compareTo(Season2.SPRING));

    }
}
// 使用enum关键词
enum Season2 {


    // 定义了四个对象
//    public static final Season2 SPRING = new Season2("Spring", "warm");
//    public static final Season2 WINTER = new Season2("Winter", "cold");
//    public static final Season2 SUMMER = new Season2("Summer", "Hot");
//    public static final Season2 FALL = new Season2("Fall", "cool");

    // 1. 使用enum替换class
    // 2. public static final Season2 SPRING 替换成 SPRING("Spring", "warm");
    //      SPRING("", "") =》 常量名(实参列表)
    // 3. 如果有多个常量（对象），使用，号间隔
    // 4. 要求将定义常量对象，写在前面
    // 5. 如果我们使用无参构造器，可以省略括号
    SPRING("Spring", "warm"),WINTER("Winter", "cold"), FALL("Fall", "Cool"), SUMMER("Summer","hot"), OTHER;
    private String name;
    private String desc;

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    private Season2() {}

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
