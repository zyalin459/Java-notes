package thread_;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("She is working hard");
            Thread.sleep(1000);
        }
    }
}

class MyDaemonThread extends Thread {
    public void run() {
        for (; ; ) {
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("lol...");
        }
    }
}
