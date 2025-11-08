import java.util.ArrayList;
import java.util.Scanner;

public class Ques3 {
    public static void main(String args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i+1);
        }int sum=0;
        for(int j=0;j<5;j++){
            sum+=arr.get(j);
        }
        System.out.println(sum);
        sc.close();

    }
}
