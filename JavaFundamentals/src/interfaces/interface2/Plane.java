package interfaces.interface2;

public class Plane extends AirTransport implements Fly{

    private int speed;

    public Plane(int speed){
        super(speed);
    }

    @Override
    public int calculateSpeed() {
        return speed + 50;
    }

    @Override
    public boolean canFly(String condition) {
        return true;
    }
}
