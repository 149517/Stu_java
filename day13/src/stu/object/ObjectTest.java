package stu.object;


public class ObjectTest {
    public static void main(String[] args){
        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());
    }
    public void test(){
        System.out.println("test");
    }

}

class Order{

}
