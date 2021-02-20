package colection;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> visitedCities = new HashSet<>();
        visitedCities.add("Vilnius");
        visitedCities.add("Kaunas");
        visitedCities.add("Klaipeda");
        visitedCities.add("Vilnius");
        visitedCities.add("Klaipeda");
        visitedCities.add("Panevezys");

        //atsispausdina tiktai unikalias reiksmes, jos nesidubliuoja, bet ne iseiles..
        for(String city : visitedCities) {
            System.out.println(city);
        }
        //isima reiksmes
        visitedCities.remove("Kaunas");
        visitedCities.remove("Talinas");
        for(String city : visitedCities) {
            System.out.println(city);
        }

        if (!visitedCities.contains("Madrid")) {
            System.out.println("Set does not contain Madrid");
        }

    }
}
