package fundamentals_tasting;

public class Circle {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int calculateCircleLenght(){
        return (int) (2 * Math.PI * radius);
    }

    public int calculateCircleArea(){
        return (int) (Math.pow(radius, 2) * Math.PI);
    }
}
