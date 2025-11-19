import java.util.*;

public class Digit_Sum_Even {
    static int digitSumEven(int n){
        int s = 0;
        while(n != 0){
            int d = n % 10;
            if(d % 2 == 0) s += d;
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitSumEven(n));
        sc.close();
    }
}
