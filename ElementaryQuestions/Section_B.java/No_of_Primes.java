import java.util.Scanner;

public class No_of_Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        System.out.println(No_of_Primes_Range(n));
        sc.close();
    }
    public static int No_of_Primes_Range(int n){
        int count=0;
        int num=1;
        while(num<=n){
            
        if(isPrime(num)) count++;
        num++;
        }
        return count;
    }
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
}
