package ss04_oop.oop;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    private String checkFan = "";

    public Fan(){
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        if (on){
            checkFan = "Quat dang bat";
            checkFan = "Quat dang tat";
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "fan{" +
                "speed=" + speed +
                ", status=" + checkFan +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
