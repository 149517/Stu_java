public class WindowTest4 {
    public static void main(String[] args) {
        Window4 win1 = new Window4();
        Window4 win2 = new Window4();
        Window4 win3 = new Window4();
        win1.setName("窗口1");
        win2.setName("窗口2");
        win3.setName("窗口3");
        win1.start();
        win2.start();
        win3.start();
    }
}

class Window4 extends Thread {
    private static int ticket = 300;


    @Override
    public void run() {
        while (true) {

            show();
        }
    }

    private static synchronized void show() {     // 将方法设置为static, 这里的同步监视器是 Window4.class 监视器只有一个，所以线程安全
//        private synchronized void show()  这里的监视器是t1,t2,t3,多个对象
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 出票成功， 票号：" + ticket);
            ticket--;
        }

    }


}