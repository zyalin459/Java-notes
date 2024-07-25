package String;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        String str = "hello tom";
        // 方式一 使用构造器
        // 注意：返回的才是StringBuffer对象，对str 本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
    }
}
