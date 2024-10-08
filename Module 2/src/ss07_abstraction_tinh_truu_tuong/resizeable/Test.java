package ss07_abstraction_tinh_truu_tuong.resizeable;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Geometric[] geometrics = new Geometric[4];
        geometrics[0] = new Circle(10);
        geometrics[1] = new Rectangle(20, 30);
        geometrics[2] = new Square(35);
        geometrics[3] = new Rectangle(24, 42);

        Random random = new Random();

        System.out.println("Diện tích ban đầu: ");
        for (Geometric geometric: geometrics) {
            System.out.println(geometric.getArea());
        }

        System.out.println("Diện tích sau thay đổi: ");
        for (Geometric geometric: geometrics) {
            double percent = 1 + random.nextInt(100);
            ((Resizeable) geometric).reSize(percent);
        }
        for (Geometric geometric: geometrics) {
            System.out.println(geometric.getArea());
        }

    }
}