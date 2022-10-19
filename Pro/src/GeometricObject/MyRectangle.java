package GeometricObject;

public class MyRectangle extends GeometricObject {
    private double wid;
    private double height;

    public MyRectangle(double wid, double height, String color, double width) {
        super(color, width);
        this.height = height;
        this.wid = wid;
    }

    public double getWid() {
        return wid;
    }

    public void setWid(double wid) {
        this.wid = wid;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea() {
        return wid * height;
    }
}
