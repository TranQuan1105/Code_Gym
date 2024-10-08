package ss07_abstraction_tinh_truu_tuong.resizeable;

public class Square extends Rectangle{
    public Square(){}

    public Square(double side) {
        super(side,side);
    }

    @Override
    public String toString() {
        return "Square{side= " + getWidth() + "}";
    }
}