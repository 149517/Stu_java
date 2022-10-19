public class WindowTest3 {
    public static void main(String[] args) {
        Window3 win3 = new Window3();

        Thread t1 = new Thread(win3);
        Thread t2 = new Thread(win3);
        Thread t3 = new Thread(win3);
        t1.setName("窗口1");
        t1.start();
        t2.setName("窗口2");
        t2.start();
        t3.setName("窗口3");
        t3.start();
    }
}

class Window3 implements Runnable {
    private static int ticket = 1000;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private synchronized void show() {  // 同步监视器，this
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "出票成功，票号：" + ticket);
            ticket--;
        }
    }
}

