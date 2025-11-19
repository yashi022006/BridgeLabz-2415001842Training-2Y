import java.util.*;

public class Sum_Last_Digits {
    static int sumLastDigits(int a, int b){
        if(a < 0){
            a = -a;
        }
        if(b < 0){
            b = -b;
        }
        return (a % 10) + (b % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumLastDigits(a, b));
        sc.close();
    }
}

