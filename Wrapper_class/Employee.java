import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        ArrayList<Integer> array=new ArrayList<>();
        for(int i=0;i<n;i++){
            Integer In=arr[i];
            array.add(In);
        }
        System.out.println(Collections.max(array));
        System.out.println(Collections.min(array));
        sc.close();
    }
}
