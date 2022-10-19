public class WindowTest2 {
    public static void main(String[] args) {
        Window2 win1 = new Window2();
        Window2 win2 = new Window2();
        Window2 win3 = new Window2();
        win1.setName("窗口1");
        win2.setName("窗口2");
        win3.setName("窗口3");
        win1.start();
        win2.start();
        win3.start();
    }
}

class Window2 extends Thread {
    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
             synchronized (obj){
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " 出票成功， 票号：" + ticket);
                    ticket--;
                } else {
                    break;
                }

            }
        }
    }


}