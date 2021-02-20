package Advanced.classes.Inheritance;

public class Car extends Vehicle {

    private String model;

    public Car(String model, int maxSpeed) {
        super(maxSpeed);
        this.model = model;
    }

    public int vehicleMaxSpeed(){

        return maxSpeed + 20;
    }

}
