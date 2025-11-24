import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>(Map.of("A", 1, "B", 2));
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        for (var e : map2.entrySet()) {
            map1.put(e.getKey(), map1.getOrDefault(e.getKey(), 0) + e.getValue());
        }

        System.out.println(map1);
    }
}
