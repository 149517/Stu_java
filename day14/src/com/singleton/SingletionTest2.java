package com.singleton;


public class SingletionTest2 {

    public static void main(String[] args) {
        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();

        System.out.println(o1 == o2);   // true
    }
}

// 懒汉式单例
class Order{
    // 1. 私有化类的构造器
    private Order(){

    }

    // 2. 声明当前类的对象，没有初始化
    // 4. 此对象也必须声明为static
    private static Order instance = null;

    //3. 声明public，static 的返回当前类对象的方法
    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }

}
