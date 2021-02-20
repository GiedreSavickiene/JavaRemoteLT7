package colection;


import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> visitedCountries = new ArrayList<>();
        visitedCountries.add("Germany");
        visitedCountries.add("Spain");
        visitedCountries.add("France");
        visitedCountries.add("Italy");
        visitedCountries.add("Spain");

        //spausdinam visa lista, sukuriam String varda country
        for (String country : visitedCountries) {
            System.out.println(country);
        }
        //jeigu noriu kazka istrinti is list
        visitedCountries.remove("France");
        for (String country : visitedCountries) {
            System.out.println(country);


        }
        //ar tame sarase yra Germany - true
        System.out.println(visitedCountries.contains("Germany"));

    }
}

