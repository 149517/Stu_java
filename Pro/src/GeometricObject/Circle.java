package GeometricObject;

public class Circle extends GeometricObject{
    private double radius;
    private double pi = Math.PI;

    public Circle(double radius,double width,String color){
        super(color, width);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return radius * radius * pi;
    }
}
