import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 1);
        Map<Integer, List<String>> inverted = new HashMap<>();

        for (var entry : map.entrySet()) {
            inverted.putIfAbsent(entry.getValue(), new ArrayList<>());
            inverted.get(entry.getValue()).add(entry.getKey());
        }

        System.out.println(inverted);
    }
}

