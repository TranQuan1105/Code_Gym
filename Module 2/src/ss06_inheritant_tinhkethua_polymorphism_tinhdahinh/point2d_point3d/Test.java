package ss06_inheritant_tinhkethua_polymorphism_tinhdahinh.point2d_point3d;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        Point2D point2D = new Point2D();
        point2D.setXY(1,2);
        point3D.setXYZ(3,4,5);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}