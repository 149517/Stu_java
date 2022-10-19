package exer;

public class Window {
    public static void main(String[] args) {
        win w1 = new win();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }


}
class win implements Runnable{
    private static int ticket = 100;
    @Override
    public void run() {
        while(true)
            if(ticket > 0 ){
                System.out.println(Thread.currentThread().getName() + ": 出票成功 ，票号为："+ ticket);
                ticket--;
            }else{
                break;
            }
    }
}
