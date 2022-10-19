package polymorphic;

public class AnimalTest {
    public static void main(String[] args){
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
    }

    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}
class Animal{
    String name;
    public void eat(){
        System.out.println("正在吃东西");
    }
    public void shout(){
        System.out.println("喊叫");
    }
}
class Dog extends Animal{
    String name = "gougou";

    @Override
    public void eat(){
        System.out.println(name + "正在吃肉");
    }
    public void shout() {
        System.out.println(name + "汪汪汪");
    }
}
class Cat extends Animal{
    String name = "喵喵";
    @Override
    public void eat(){
        System.out.println(name + "正在吃yu");
    }
    public void shout() {
        System.out.println(name + "正在 喵！喵！喵！");
    }
}
