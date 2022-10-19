package com.Interface;

public class interfaceTest2 {

}

// java 8 中接口还可以定义静态方法，默认方法

interface CompareA{
    // 静态方法
    public static void method(){
        System.out.println("shijian");
    }

    // 默认方法
    public default void method2(){
        System.out.println("default");
    }

    default void method3(){
        System.out.println("fhawue");
    }
}
