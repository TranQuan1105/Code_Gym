package ss6_inheritant_tinhKeThua_polymorphism_tinhDaHinh.Point_va_MoveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point(){}

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public static void setXY(Point point,float x, float y){
        point.x = x;
        point.y = y;
    }

    public float[] getXY(){
        return new float[]{x,y};
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
