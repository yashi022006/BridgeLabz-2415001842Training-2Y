import java.util.*;

public class NthPrime {
    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    static int nthPrime(int n){
        int count = 0;
        int num = 1;
        while(count < n){
            num++;
            if(isPrime(num)) count++;
        }
        return num;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nthPrime(n));
        sc.close();
    }
}
