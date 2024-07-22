package Basic.stream;

import java.io.IOException;

public class Stream {
    public static void main(String[] args) throws IOException {
        System.out.println("hello world");
        byte[] buffer = new byte[1024];
        try {
            int len = System.in.read(buffer);
            String s = new String(buffer, 0, len);
            System.out.println("Read "+len+" bytes.");
            System.out.println(s);
            System.out.println("Length of s: "+s.length());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

