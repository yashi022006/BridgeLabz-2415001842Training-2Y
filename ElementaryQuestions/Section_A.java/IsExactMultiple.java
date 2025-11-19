import java.util.*;

public class IsExactMultiple {
    static boolean isExactMultiple(int n, int m){
        if(m == 0){
            return false;
        }
        if(n % m == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(isExactMultiple(n, m));
        sc.close();
    }
}

