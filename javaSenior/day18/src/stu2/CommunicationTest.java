package stu2;

public class CommunicationTest {
    public static void main(String[] args) {
        Number n1 = new Number();
        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n1);

        t1.setName("线程一：");
        t2.setName("线程2：");
        t1.start();
        t2.start();
    }
}

class Number implements Runnable {
    private int number = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                // 唤醒线程
                notify();
                if (number > 0) {
                    System.out.println(Thread.currentThread().getName() + " : " + number);
                    number--;
                    try {
                        // 使得调用如下wait()方法的线程进入阻塞状态
                        // 释放锁
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}
