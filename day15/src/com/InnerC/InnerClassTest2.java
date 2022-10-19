package com.InnerC;

public class InnerClassTest2 {

    public void method() {
        // 局部内部类
        class AA {

        }
    }

    // 返回一个实现了Comparable接口类的对象
    public Comparable getComparable() {
        // 创建了一个实现Comparable接口的类：局部内部列
        // 方式一
        class MyComparable implements Comparable {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();

        // 方式2
//        return new MyComparable(){
//            public int compareTo(Object o){
//                return 0;
//            }
    }
}

