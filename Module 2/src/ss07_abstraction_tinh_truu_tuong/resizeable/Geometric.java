package ss07_abstraction_tinh_truu_tuong.resizeable;

public abstract class Geometric implements Resizeable {
    public Geometric(){
    }

    @Override
    public abstract String toString();

    public abstract double getArea();

    public abstract double getPerimeter();
}
