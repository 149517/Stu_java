package com.Interface;

public class InterfaceTest {

}
interface Flyable{
    // 全局常量
    public static final int MAX_SPEED = 7900;
        // 省略public static final 的情况
    int MIN_SPEED = 1;

    // 抽象方法
    public abstract void fly();
        // 省略public abstract
    void stop();
}
interface Attackable{
    public abstract void attack();

}
class Bullet implements Flyable,Attackable{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}
class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("能够通过引擎起飞");
    }
    public void stop(){
        System.out.println("落地停止");
    }
}