package ss07_abstraction_tinh_truu_tuong.colorable;

public class Test {
    public static void main(String[] args) {
        Geometric[] geometrics = new Geometric[4];
        geometrics[0] = new Circle();
        geometrics[1] = new Rectangle();
        geometrics[2] = new Square();
        geometrics[3] = new Circle();


        for (Geometric geometric: geometrics) {
            if (geometric instanceof Colorable) {
                System.out.println(((Colorable) geometric).howToColor());
            }
        }
    }
}