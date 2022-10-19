package exer;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

        // 创建Thread类的匿名子类的方式
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 101; i++) {
                    System.out.print("  aa");
                }
            }
        }.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print("  " + i);
            }
        }
        System.out.println("");
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            if (i % 2 != 0) {
                System.out.print(" *" + i);
            }
        }
    }
}