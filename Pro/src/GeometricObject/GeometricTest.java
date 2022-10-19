package GeometricObject;

public class GeometricTest {

    public static void main(String[] args){
        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle(2.3,1.0,"white");
        MyRectangle r1 = new MyRectangle(3.3,5.6,"black",1.0);
        test.displayGeometricObejct(c1);
        test.displayGeometricObejct(r1);
        test.equalsArea(c1,r1);
        // 多态的使用，虽然在方法中的形参是父类对象，但是在实际使用中使用的是子类
    }

    public void equalsArea(GeometricObject o1,GeometricObject o2){
        if(o1.findArea() == o2.findArea()){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
    }
    public void displayGeometricObejct(GeometricObject o1){
        System.out.println(o1.findArea());
    }
}
