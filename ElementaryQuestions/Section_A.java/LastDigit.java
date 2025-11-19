import java.util.*;

public class LastDigit {
    static int lastDigit(int n){
        if(n < 0){
            n = -n;
        }
        return n % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(lastDigit(n));
        sc.close();
    }
}
