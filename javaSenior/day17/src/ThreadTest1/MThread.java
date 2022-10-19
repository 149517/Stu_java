package ThreadTest1;

// 1. 创建一个实现类 Runnable 接口的类
public class MThread implements Runnable{

    // 2. 实现类去实现Runnable中的抽象方法：run

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
