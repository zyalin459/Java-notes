package ThreadExercise;

import java.util.Locale;
import java.util.Scanner;

public class ThreadExercise01 {
    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        Thread02 thread02 = new Thread02(thread01);
        thread01.start();
        thread02.start();
    }
}

class Thread01 extends Thread {
    public boolean flag = true;
    @Override
    public void run() {
        while (flag) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Math.round(Math.random() * 100 + 1));
        }
    }
}
class Thread02 extends Thread {
    private Thread01 thread01;
    private Scanner in = new Scanner(System.in);
    public Thread02(Thread01 thread01) {
        this.thread01 = thread01;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Please enter: ");
            char key = in.next().toUpperCase().charAt(0);
            System.out.println("Typed: " + key);
            if (key == 'Q') {
                System.out.println("Detected Q, quit...");
                thread01.flag = false;
                break;
            }
        }
    }
}
