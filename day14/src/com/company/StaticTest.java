package com.company;

public class StaticTest {
    public static void main(String[] args){
        Chinese.nation = "中国";
        Chinese.show();

        Chinese c1 = new Chinese();
        c1.name = "xuxu";
        c1.age = 23;

        Chinese c2 = new Chinese();
        c2.name = "fanfg";
        c2.age = 25;

        c1.nation = "CHN";

        System.out.println(c2.nation);
    }

}
class Chinese{
    String name;
    int age;
    static String nation;

    public static void show(){
        System.out.println("这是一个静态方法，可以通过类直接调用");
    }
}
