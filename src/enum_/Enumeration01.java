package enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.FALL);
        System.out.println(Season.SPRING);
    }
}

class Season {
    private String name;
    private String desc;

    // 定义了四个对象
    public static final Season SPRING = new Season("Spring", "warm");
    public static final Season WINTER = new Season("Winter", "cold");
    public static final Season SUMMER = new Season("Summer", "Hot");
    public static final Season FALL = new Season("Fall", "cool");

    // 1. 将构造器私有化，目的防止直接new
    // 2. 只提供getter，防止属性被修改
    // 3. 在类内部，直接创建固定的对象
    // 4. 优化，可以加入final修饰符
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
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