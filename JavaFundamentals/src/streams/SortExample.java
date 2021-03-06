package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michale", "Brad");

        List<String> sortedNames = names.stream()
                //surusiuoja abeceles tvarka
                .sorted()
                .collect(Collectors.toList());

        List<String> sortedNamesInRevwrsOrder = names.stream()
                //surusiuoja atvirksciai abecelei
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(names);
        System.out.println(sortedNames);
        System.out.println(sortedNamesInRevwrsOrder);
    }

}
