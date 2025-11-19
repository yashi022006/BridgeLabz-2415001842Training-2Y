import java.util.*;

public class CountOdd {
    static int countOdd(int[] arr){
        int c1= 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                c1++;
            }
        }
        return c1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(countOdd(arr));
        sc.close();
    }
}
