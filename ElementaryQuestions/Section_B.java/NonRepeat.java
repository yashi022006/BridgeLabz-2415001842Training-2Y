import java.util.*;

public class NonRepeat {
    static int nonRepeated(int n){
        int[] freq = new int[10];
        int temp = n;
        while(temp != 0){
            freq[temp % 10]++;
            temp /= 10;
        }
        int c = 0;
        for(int f : freq) if(f == 1) c++;
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nonRepeated(n));
        sc.close();
    }
}

