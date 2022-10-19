package ThreadTest1;

public class ThreadTest {
    public static void main(String[] args) {
        // 3. 创建实现类的对象
        MThread mThread = new MThread();
//        4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(mThread);
        // 5. 通过Thread类的对象调用start()
        t1.start();
    }
}
