package streams;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Tom", "Brandon", "Michale");



        //noriu kad butu atspausdinta taip: "Tom : Brandon : Michael"
        //kai norim pakeisti ir modifikuoti yra naudojamas metodas Reduce

        //visi vardai vienam kintamajam

        //klaustukas if ka reiskia
       /* if (5 > 10) {
            System.out.println("penki daugiau uz desimt");
        }else {
            System.out.println("penki maziau uz desimt");
        }
        //galima rasyti taip"
        5>10 ? System.out.println("penki daugiau uz desimt") : System.out.println("penki maziau uz desimt");
        */

        String text = names.stream()
                //susideda uzrasymas is dvieju daliu

                .reduce("",(currentValue, element) -> (currentValue.isEmpty() ?"" : currentValue + ": ") + element);
        System.out.println(text);

        // currentValue - tarpine reiksme, element - iteracijos reiksme
        //1 - a iteracija -kabutes pradzioje simpbolizuoja text kintamojo pradine reiksme text = "",
        //currentValue = "" - tai tuscia reiksme
        //element = yyra pirma sarase esanti reiksme "Tom"
        //2 - a iteracija: text = "", currentValue = "Tom", element = "Bramdom",
        //3-a iteracija text = "", currentValue = "Tom: Brandon", element kintamasis bus = "Michael"
        // po trecios iteracijos turesim kintamojo reikeme Tom : Brandom: Michael
        //po visu iteraciju text yra = tokiai reiksmei : "Tom : Brandom: Michael"

        int num = names.stream()
                .map(name -> name.length()) // tai reiskia [3, 7, 7 ]
                .reduce(0,
                        (currentSum, number) -> (number > 3 ? 1 : 0) + currentSum);
        System.out.println(num);

        //1-a iteracija  currentSum = 0; number = 3 (pirmo skaiciaus reiksme), ivygdzius iteracija currentSum :0
        //2-a iteracija currentSum = 0; number = 7 (sekantis skaicius), ivykdzius iteracija currentSum : 1 padidejo vienetu
        //3-a iteracija currentSum = 1; number = 7 (sekantis skaicius)  currentSum :2 padideja dar vienetu

        //reduce metodas susidaro is (pradine reiksme, (sumine/arba tarpine reiksme, iteruojama reiksme))





    }
}
