package interfaces.interface2;

public class Main {
    public static void main(String[] args) {

        Baloon baloon = new Baloon(50);
        System.out.println(baloon.calculateSpeed());
        System.out.println(baloon.canFly("bad"));

        Plane plane = new Plane(600);
        System.out.println(plane.calculateSpeed());
        System.out.println(plane.canFly("bad"));


    }
}
