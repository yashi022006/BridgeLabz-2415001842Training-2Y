import java.util.*;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), div = sc.nextInt();
        int[] rq = findRemainderAndQuotient(num, div);
        System.out.println("Remainder: " + rq[0] + " Quotient: " + rq[1]);
        sc.close(); 
    }
}

