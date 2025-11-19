import java.util.*;

public class Count_Digits {
    static int countDigits(int n){
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
        sc.close();
    }
}

