package generics.genericClass_class.example1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(0);
        String text = "tekstas";
        int number = 50;

        GenericBox<Car> boxWithCarInIt = new GenericBox<>(car);
        GenericBox<String> boxWithText = new GenericBox<>(text);
        GenericBox<Integer> boxWithNumber = new GenericBox<>(number);

        System.out.println(boxWithCarInIt.getItem());
        System.out.println(boxWithNumber.getItem());

        //kuriam objekta kur nerasom skliausty<>
        GenericBox genericBox = new GenericBox();
        //pasinaudojam seteriu, turi buti iddedamas objektas
        genericBox.setItem("sekmadienis");
        genericBox.setItem(new Car(5));
        genericBox.setItem(BigDecimal.ZERO);

        System.out.println(genericBox.getItem());



    }
}
