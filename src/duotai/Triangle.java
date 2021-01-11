package duotai;

public class Triangle extends Shape{
    public Triangle(float bottom, float height) {
        this.bottom = bottom;
        this.height = height;
    }

    private float bottom;
    private float height;
    @Override
    public float cleaArea() {
        return (bottom*height)/2;
    }
}
