import java.util.Scanner;

public class Input{
    public static Boolean Verification(String Age){
        try {
            int age=Integer.parseInt(Age);
            if(age>=18 && age<120){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String age=sc.next();
        System.out.println(Verification(age));
        
        
    }
}