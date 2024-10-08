package ss07_abstraction_tinh_truu_tuong.resizeable;

public class Rectangle extends Geometric implements Resizeable{
    private double width;
    private double length;

    public Rectangle(){
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void reSize(double percent) {
        setWidth(getWidth() * (1 - percent / 100));
        setLength(getLength() * (1 - percent / 100));
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width * length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
