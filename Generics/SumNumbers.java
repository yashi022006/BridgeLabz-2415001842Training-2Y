import java.util.*;

class NumberUtil {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}

public class SumNumbers {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> dblList = Arrays.asList(1.5, 2.5, 3.5);

        System.out.println(NumberUtil.sumNumbers(intList));
        System.out.println(NumberUtil.sumNumbers(dblList));
    }
}

