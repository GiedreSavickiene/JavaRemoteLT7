package Advanced.classes.Inheritance;

public class Ship extends Vehicle {

    public Ship(int maxSpeed){
        super(maxSpeed);
    }

    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed *2;
    }

}
