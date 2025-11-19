import java.util.*;

public class Unique_Count {
    static int uniqueDigits(int n){
        boolean[] seen = new boolean[10];
        while(n != 0){
            seen[n % 10] = true;
            n /= 10;
        }
        int c = 0;
        for(boolean b : seen)if(b) c++;
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(uniqueDigits(n));
        sc.close();
    }
}
