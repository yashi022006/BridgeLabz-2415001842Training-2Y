import java.util.ArrayList;
import java.util.Objects;

public class Ques8 {
    public static void Store(int a[],ArrayList<Integer> arr,ArrayList<Integer>newA){
    for(Integer i:arr){
        if(Objects.nonNull(i)){
            newA.add(i);
        }
    }
    for(int i:a){
        newA.add(i);
    }

}
public static int Avg(ArrayList<Integer> newA){
    int sum=0;
    for(Integer i:newA){
        if(Objects.nonNull(i)){
            sum+=i;
        }
    }
    return sum;
}
    public static void main(String[] args) {
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(null);
    int a[]={3,4,5,6}; 
    ArrayList<Integer> newA=new ArrayList<>();
    Store(a, arr, newA);
    int sum=Avg(newA);
    System.out.println(newA);
    
    System.out.println(sum);
    
    }
    
}
