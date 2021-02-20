package Advanced.classes.Inheritance;

public class Bout extends Vehicle {

    public Bout(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed + 15;
    }
}
