package LockTest;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static void main(String[] args) {
        Lock l1 = new Lock();
        Thread t1 = new Thread(l1);
        Thread t2 = new Thread(l1);
        Thread t3 = new Thread(l1);

        t1.setName("窗口1");
        t1.start();
        t2.setName("窗口2");
        t2.start();
        t3.setName("窗口3");
        t3.start();
    }
}

class Lock implements Runnable {
    private static int ticket = 100;

    // 1. 实例化ReentrantLock
    // fair 公平的，设置为true时候，线程先进先出
    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            try {
            // 2.调用锁定的方法 lock
                lock.lock();

                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " 出票成功， 票号为 ：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }finally {
                //3. 调用解锁方法
                lock.unlock();
            }
        }
    }
}
