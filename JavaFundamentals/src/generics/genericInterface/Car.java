package generics.genericInterface;

public class Car implements Comparable<Car>{

    private int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed =maxSpeed;
    }

    @Override
    public int compareTo(Car object) {
        return this.maxSpeed - object.maxSpeed;
    }

    @Override
    public Car getObjec() {
        return null;
    }
}
