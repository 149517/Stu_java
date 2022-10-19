package com.exer;

public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5.6);
        ComparableCircle c2 = new ComparableCircle(4.3);
        System.out.println(c1.compareTo(c2));

    }
}

interface CompareObject{
    public int compareTo(Object o);
}

class Circle{
    private double radius;

    public Circle(){
        super();
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
}
class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;
            if(this.getRadius() > c.getRadius()){
                return 1;
            }else if(this.getRadius() < c.getRadius()){
                return -1;
            }else{
                return 1;
            }
        }else{
            return -2;
        }
    }
}