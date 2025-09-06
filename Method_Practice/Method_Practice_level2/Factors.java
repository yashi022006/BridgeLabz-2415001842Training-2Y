import java.util.*;

public class Factors {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }
    public static int sum(int[] arr) {
        int s = 0; for (int x : arr) s += x; return s;
    }
    public static int sumSquares(int[] arr) {
        int s = 0; for (int x : arr) s += Math.pow(x,2); return s;
    }
    public static int product(int[] arr) {
        int p = 1; for (int x : arr) p *= x; return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = findFactors(n);
        System.out.println(Arrays.toString(f));
        System.out.println(sum(f));
        System.out.println(sumSquares(f));
        System.out.println(product(f));
        sc.close();
    }
}
