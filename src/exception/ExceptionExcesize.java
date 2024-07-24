package exception;

import java.util.Scanner;

public class ExceptionExcesize {
    public static void main(String[] args) {
        // 如果用户输入的不是一个整数，就提示他反复输入，知道输入一个整数为止

        Scanner in = new Scanner(System.in);
        int num = 0;
        String input = "";
        while (true) {
            System.out.println("请输入一个整数");
            try {
                input = in.next();
                num = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }
        }

        System.out.println("你输入的是：" + num);

    }
}
