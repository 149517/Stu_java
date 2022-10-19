package com.singleton;

public class SingletonTest1 {

    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2); // true
    }
}
// 饿汉式单例实现
class Bank {
    // 1. 私有化类的构造器
    private Bank() {

    }

    // 2. 内部创建类的对象
    // 4. 要求此对象也必须声明为静态的
    private static Bank instance = new Bank();

    // 3. 提供公共的静态的方法，返回类的对象
    // 使用static才能使，方法返回的方法能够调用，而不是需要在外边先创建类的对象
    public static Bank getInstance() {
        return instance;
    }
}
