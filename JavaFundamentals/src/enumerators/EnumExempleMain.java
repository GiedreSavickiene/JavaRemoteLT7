package enumerators;

public class EnumExempleMain {
    public static void main(String[] args) {
        System.out.println(Coffee.AMERICANO.name());

        Coffee coffee = Coffee.valueOf("LATTE");
        System.out.println(coffee.name());


        System.out.println(CarMaker.BMV.fullName);

    }
}
