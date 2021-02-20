package Advanced.classes.Inheritance;

public class AbstractInheritanceExample {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", 50);
        System.out.println(car1.vehicleMaxSpeed());
        Bout bout1 = new Bout(10);
        System.out.println(bout1.vehicleMaxSpeed());
        Ship ship1 = new Ship(15);
        System.out.println(ship1.vehicleMaxSpeed());


    }
}
