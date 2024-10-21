package ss6_inheritant_tinhKeThua_polymorphism_tinhDaHinh.Point_va_MoveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(MoveablePoint moveablePoint, float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        moveablePoint.xSpeed = xSpeed;
        moveablePoint.ySpeed = ySpeed;
    }   
    public MoveablePoint (){}

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed (){
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MoveablePoint move (){
        setX(getX() + xSpeed);
        setX(getY() + ySpeed);
        return this;
    }
}