package optinal;

import java.util.Optional;

public class OptinalExample {

    public static void main(String[] args) {
        Optional<String> stringOptional1 = Optional.of("Heloo");
        Optional<String> stringOptional2 = Optional.of("World");
        Optional<String> stringOptional3 = Optional.ofNullable(null);

        //Lambda expression
        stringOptional1.ifPresent(variable -> System.out.println(variable));

        //igauna naujas reiksmes, nei buvo inicializuota objektuose
        String text = stringOptional2.orElse("Tekstas");
        String value = stringOptional3.orElse("Hello World!");

        System.out.println(text);
        System.out.println(value);

        //jei nebutu Optional , tada butu grazine null klaida




    }
}