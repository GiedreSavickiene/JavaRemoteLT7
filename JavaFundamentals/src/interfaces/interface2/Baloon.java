package interfaces.interface2;

import java.util.Random;

public class Baloon extends AirTransport implements Fly {



    public Baloon (int speed) {
       super(speed);
    }

    @Override
    public int calculateSpeed() {
        Random random = new Random(5);
        return 100/ speed * random.nextInt();
    }

    @Override
    public boolean canFly(String condition) {
        return condition.equalsIgnoreCase("good");
    }
}
