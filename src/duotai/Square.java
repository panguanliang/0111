package duotai;

public class Square extends Shape{
    public Square(float length) {
        this.length = length;
    }
    private float length;
    public float cleaArea(){
        return length*length;
    }
}
