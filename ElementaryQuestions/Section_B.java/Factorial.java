import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
        sc.close();

    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }else{
            int result = 1;
            for(int i=n-1; i>=1; i--){
                result = result * i;
            }
            return result;
        }
        
    }
}
