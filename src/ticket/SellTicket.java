package ticket;

public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();

        SellTicket01 sellTicket01 = new SellTicket01();
        new Thread(sellTicket01).start();
        new Thread(sellTicket01).start();
        new Thread(sellTicket01).start();
    }
}

class SellTicket01 extends Thread {
    private static int ticketNum = 100;
    private boolean loop = true;

    public synchronized void sell() {
        if (ticketNum <= 0) {
            System.out.println("售票结束");
            loop = false;
            return;
        }

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票" + "剩余票数=" + (--ticketNum));

    }

    @Override
    public void run() {
        while(loop) {
            sell();
        }
    }
}
