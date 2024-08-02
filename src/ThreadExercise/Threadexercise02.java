package ThreadExercise;

public class Threadexercise02 {
    public static void main(String[] args) {
        Thread03 thread03 = new Thread03();
        Thread thread1 = new Thread(thread03);
        thread1.setName("t1");
        Thread thread2 = new Thread(thread03);
        thread2.setName("t2");
        thread1.start();
        thread2.start();
    }
}
class Thread03 implements Runnable {
    private int remain = 10000;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (remain < 1000) {
                    System.out.println("No enough money...");
                    break;
                }
                remain -= 1000;
                System.out.println(Thread.currentThread().getName() + "withdrew ¥1000，" + remain + " remaining" );
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
