package inheritance3;

public class Person {
    String name;
    int age;
    int id = 10001; // ID card

    public Person(){

    }
    public Person(String name){
        this.name = name;
    }
    public Person(String name,int age){
        this(name);
        this.age = age;
    }
    public void eat(){
        System.out.println("准备吃饭");
    }
}
