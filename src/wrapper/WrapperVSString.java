package wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        Integer i = 100;
        // Integer => String
        // Method 1
        String str1 = i + "";
        // Method 2
        String str2 = i.toString();
        // Method 2
        String str3 = String.valueOf(i);

        // String => Integer
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);

    }
}
