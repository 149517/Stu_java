package com.exer;

public class exer {
    public static void main(String[] args) {
        new C().px();
    }
}
interface A{
    int x = 0;
}
class B{
    int x = 1;
}
class C extends B implements A{
    public void px(){
//        System.out.println(x);    Reference to 'x' is ambiguous, both 'B.x' and 'A.x' match
        //父类中的 属性
        System.out.println(super.x);
        // 接口中的调用
        System.out.println(A.x);
    }
}
