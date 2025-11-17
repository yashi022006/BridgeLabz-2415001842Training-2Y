import java.util.*;
import java.util.function.Predicate;

public class AlertFilter {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList(
                "High BP", "Low Sugar", "Normal Checkup", "Emergency", "Fever"
        );

        Predicate<String> criticalOnly = a -> a.equals("High BP") || a.equals("Emergency");

        System.out.println("Critical Alerts:");
        alerts.stream()
                .filter(criticalOnly)
                .forEach(System.out::println);
    }
}
