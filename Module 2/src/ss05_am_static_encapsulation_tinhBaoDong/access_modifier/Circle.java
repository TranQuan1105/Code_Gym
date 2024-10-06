package ss05_am_static_encapsulation_tinhBaoDong.access_modifier;

import java.awt.geom.Area;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }

    public double Circle (double radius) {
        return this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return this.getRadius() * this.radius * Math.PI;
    }
}
