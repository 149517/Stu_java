package exer;

import java.util.concurrent.locks.ReentrantLock;

public class AccountTest {
    public static void main(String[] args) {
        Account ac = new Account();
        Thread t1 = new Thread(ac);
        Thread t2 = new Thread(ac);

        t1.setName("张飒");
        t2.setName("王");
        t1.start();
        t2.start();
    }
}

class Account implements Runnable {
    private static int bank = 0;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
           try{
               lock.lock();
               bank+=1000;
               System.out.println(Thread.currentThread().getName() + " 向账户中存款，存款金额 ：1000 ，现有余额："+ bank);
           }finally {
               lock.unlock();
           }
        }

    }
}
