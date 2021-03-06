package streams;

import java.util.Arrays;
import java.util.List;

public class MatchExample1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michale");

        //sutrumpintas varianras is MatchExample klases

        boolean isThereANameWitchLenghtGTTan3 = names.stream().
                anyMatch(name -> name.length() > 3);
        System.out.println("Ar bent vienas vardas, kurio ilgis yra >3: " + isThereANameWitchLenghtGTTan3);

        boolean areAllANameLenghtGTTan3 = names.stream()
                .allMatch(name -> name.length() > 3);
        System.out.println("Ar visu vardu ilgiai yra > 3: " + areAllANameLenghtGTTan3);


    }
}
