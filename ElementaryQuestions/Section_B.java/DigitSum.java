import java.util.*;

public class DigitSum {
    static int digitSum(int n){
        int s = 0;
        while(n != 0){
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitSum(n));
        sc.close();
    }
}

