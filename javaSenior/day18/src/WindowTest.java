public class WindowTest {
    public static void main(String[] args) {
        Window win = new Window();
        Thread t1 = new Thread(win);
        Thread t2 = new Thread(win);
        Thread t3 = new Thread(win);
        t1.setName("窗口1");t1.start();
        t2.setName("窗口2");t2.start();
        t3.setName("窗口3");t3.start();
    }

}

class Window implements Runnable{
    private static int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while(true){
            synchronized(obj){
                if(ticket > 0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    System.out.println(Thread.currentThread().getName() + "出票成功，票号："+ ticket);
                    ticket--;
                }else{
                    break;
                }
            }

        }
    }
}
