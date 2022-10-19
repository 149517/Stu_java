package com.InnerC;

public class InnerClassTest3 {

    public void method(){
        // 局部变量
        int num = 10;

        class AA{
            public void show(){
                // 这里的num不能够修改，因为 外部的类中的num实际上是final修饰的
//                num = 90;
                System.out.println(num);
            }

        }
    }
}
