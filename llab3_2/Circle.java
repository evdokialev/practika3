package llab3_2;
import  java.lang.*;

public class Circle extends Shape{
    protected double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return 0;
    }
    @Override
    public double getPerimeter(){
        return 0;
    }
    @Override
    public String toString(){
        return "Shape{" + "color='" + color + '\'' + ", filled=" + filled + '}';
    }
}
