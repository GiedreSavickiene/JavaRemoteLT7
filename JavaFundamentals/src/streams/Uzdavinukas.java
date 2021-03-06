package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Uzdavinukas {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Rytas", "Lova", "Durys", "Automobilis", "Katinas");

        String concatenadedString = words.stream()
                .reduce("", (concatenadedText, word) -> concatenadedText + word);
        System.out.println(concatenadedString);

        String concatenadedStringInCapital = words.stream()
                .map(word -> word.toUpperCase(Locale.ROOT))
                .reduce("", (concatenadedText, word) -> concatenadedText + word);
        System.out.println(concatenadedStringInCapital);

        String concatenadedStringkablelis = words.stream()
                .reduce("", (concatenadedText, word) -> concatenadedText + "," + word);
        System.out.println(concatenadedStringkablelis);

        String concatenadedStringfive = words.stream()
                .filter(word -> word.length() > 5)
                .reduce("", (concatenadedText, word) -> (concatenadedText.isEmpty() ? "" : concatenadedText + ", ") + word);
        System.out.println(concatenadedStringfive);
    }
}
