import java.util.*;

public class Second_Last_Digit {
    public static int secondLastDigit(int n){
        if(n < 0){
            n = -n;
        }
        return (n / 10) % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(secondLastDigit(n));
        sc.close();
    }

 {
    
}
}
