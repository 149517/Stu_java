package polymorphic;

public class Test {
    public static void main(String[] args){
        Person p1 = new Person();
        // 对象的多态性
        Person p2 = new Man();
        Man m1 = (Man)p2;
        m1.hobby();

    }
}
