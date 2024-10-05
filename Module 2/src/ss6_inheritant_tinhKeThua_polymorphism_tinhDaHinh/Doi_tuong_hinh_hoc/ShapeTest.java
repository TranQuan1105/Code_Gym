package ss6_inheritant_tinhKeThua_polymorphism_tinhDaHinh.Doi_tuong_hinh_hoc;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", true);
        System.out.println(shape);
    }
}

