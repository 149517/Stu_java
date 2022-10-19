package stu;

// 使用同步机制将单例模式中的懒汉式改为线程安全的
public class BankTest {

}

class Bank {
    private Bank() {}

    private static Bank instance = null;

    public static Bank getInstance() {
//        synchronized (Bank.class) {
//            if (instance == null) {
//                instance = new Bank();
//            }
//            return instance;
//        }
        // 比方式一效率稍高
        if (instance == null) {
            synchronized (Bank.class) {
                instance = new Bank();
            }
            return instance;
        }
        return null;
    }
}
