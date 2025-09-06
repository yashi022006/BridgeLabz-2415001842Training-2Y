import java.util.*;
public class OTPGenerator {
    public static int generateOTP() {
        return 100000+(int)(Math.random()*900000);
    }
    public static boolean validateUnique(int[] o) {
        Set<Integer> s=new HashSet<>();
        for(int x:o) s.add(x);
        return s.size()==o.length;
    }
    public static void main(String[] args) {
        int[] o=new int[10];
        for(int i=0;i<10;i++) o[i]=generateOTP();
        System.out.println(Arrays.toString(o));
        System.out.println("Unique: "+validateUnique(o));
    }
}

