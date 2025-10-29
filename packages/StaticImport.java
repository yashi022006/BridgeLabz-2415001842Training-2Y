
import static java.lang.Math.*;

public class StaticImport {
    public static void main(String[] args) {
        double a = 25, b = -9;
        System.out.println("Square root of 25: " + sqrt(a));
        System.out.println("2 to the power 3: " + pow(2,3));
        System.out.println("Max of 5 and 8: " + max(5,8));
        System.out.println("Min of 5 and 8: " + min(5,8));
        System.out.println("Absolute of -9: " + abs(b));
    }
}
