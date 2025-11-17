import java.util.*;

public class UpperCaseNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Riya", "Aman", "Neha");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
