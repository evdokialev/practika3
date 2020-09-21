package llab3_2;

public class Square extends Rectangle{
    protected double side;
    public Square() {}
    public Square(double side){
        super();
        this.side = side;
    }
    public Square(double side,String color,boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double side) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{" + "color='" + color + '\'' + ", filled=" + filled + ", width=" + width + ", length=" + length + ", side=" + side + '}';
    }
}
