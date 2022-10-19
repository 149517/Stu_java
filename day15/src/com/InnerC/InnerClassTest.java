package com.InnerC;

public class InnerClassTest {
    public static void main(String[] args) {
        // 创建静态成员内部类
        Person.Man ma = new Person.Man();
        ma.say();

        // 创建非静态的成员内部类
        Person p = new Person();
        Person.Woman wo = p.new Woman();
        wo.eat();

    }

}
class Person{
    String name;
    int age;
    public void aa(){

    }
    static class Man{
        String name;
        public void say(){
            System.out.println("nihao");
        }

    }
    class Woman{
        String name;
        public void eat(){
            System.out.println("吃饭");
        }
        public void put(String name){
            System.out.println(name);   // 方法的形参
            System.out.println(this.name);      // 内部类的属性
            System.out.println(Person.this.name);       // 外部类的属性
        }
    }
}
