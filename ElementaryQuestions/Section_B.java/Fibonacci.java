public class Fibonacci {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n ==1) {
            return 1;
        } else {
            int a = 0, b = 1, fibo_n = 1;
            for (int i = 2; i <= n; i++) {
                fibo_n = a + b;
                a = b;
                b = fibo_n;
            }
            return fibo_n;
        }
    }
}
