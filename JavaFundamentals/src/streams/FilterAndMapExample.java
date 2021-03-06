package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michale", "Bred");

        /*//Isspausdinti vardu kurie prasideda raide B
        for(int i = 0; i < names.size(); i++) {
            if(names.get(i).startsWith("B")) {
                System.out.println(names.get(i));
            }
        }
        */
        //atfiltruoja salyga atitinkancias reiksmes
        //kintamojo pavadinimas "name" egzistuoja tik siuose sklaiustuose
        names.stream()
                .filter(name -> name.startsWith("B"))
                //kiekviena atfilturota reiksme atspausdinu
                .forEach(name -> System.out.println(name));

        //Paversti vardu sarasa i ju simboliu skaiciu
        /*
        List<Integer> nameLenghts = new ArrayList<>();
        for(int i = 0; i < names.size(); i++) {
            nameLenghts.add(names.get(i).length());
        }
        */
        //kai keiciama saraso struktura naudojamas map metodas
        List<Integer> nameLenghts = names.stream()
                //pasiverciam kiekviena varda i jo simboliu skaiciu
                .map(name -> name.length())
                //paverte sarasa i skaicius, atfilturojam
                .filter(lenght -> lenght > 5)
                .map(number -> number*10)
                //privalom surinkti reiksmes, visos reikmes bus sugrupuotos ir idetos i sarasa
                .collect(Collectors.toList());
        System.out.println(nameLenghts);

        names.stream()
                .filter(name -> name.length() >= 7)
                .forEach(name -> System.out.println(name));

    }
}
