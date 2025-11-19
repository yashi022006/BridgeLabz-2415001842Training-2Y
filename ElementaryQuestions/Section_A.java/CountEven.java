import java.util.*;

public class CountEven {
    static int countEven(int[] arr){
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(countEven(arr));
        sc.close();
    }
}
