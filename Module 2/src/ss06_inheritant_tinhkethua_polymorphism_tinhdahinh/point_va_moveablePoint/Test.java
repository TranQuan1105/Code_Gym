package ss06_inheritant_tinhkethua_polymorphism_tinhdahinh.point_va_moveablePoint;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        MoveablePoint moveablePoint = new MoveablePoint();
        Point.setXY(point, 1,2);
        /*MoveablePoint.setSpeed(1,2);*/
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(Arrays.toString(moveablePoint.getXY()));
    }
}