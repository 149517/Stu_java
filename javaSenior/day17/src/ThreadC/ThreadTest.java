package ThreadC;

public class ThreadTest {
    public static void main(String[] args) {
        // 3. 创建子类的对象
        MyThread th = new MyThread();
        // 4. 通过此对象调用start()
        th.start();
//        System.out.println("Hello");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i+"****");
            }
        }
    }

}

// 1. 创建继承于Thread的子类
class MyThread extends Thread {

    // 2. 重写Thread中的run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
