import java.util.*;

public class Digit_Sum {
    static int digitSumOpt(int n, int opt){
        int s = 0;
        while(n != 0){
            int d = n % 10;
            if(d % 2 == opt) s += d;
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int opt = sc.nextInt();
        System.out.println(digitSumOpt(n, opt));
        sc.close();
    }
}
