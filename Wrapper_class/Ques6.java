import java.util.Scanner;

public class Ques6 {
    public static int safeParseInt(String input){
        try {
           Integer I=Integer.parseInt(input);
        return I; 
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        System.out.println(safeParseInt(st));
        sc.close();
    }
}
