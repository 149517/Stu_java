package GeometricObject;

public class GeometricObject {
    private String color;
    private double width;
    public GeometricObject(){

    }
    public GeometricObject(String color,double width){
        this.color = color;
        this.width = width;
    }
    public String getColor(){
        return color;
    }
    public void setZColor(String color){
        this.color = color;

    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double findArea(){
        return 0.0;
    }
}
