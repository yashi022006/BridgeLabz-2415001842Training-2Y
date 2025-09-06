import java.util.Random;
public class Football_Hights {
    

    public static int sum(int[] a) {
        int s=0; for(int i:a) s+=i; return s;
    }
    public static double mean(int[] a) {
        return (double)sum(a)/a.length;
    }
    public static int shortest(int[] a) {
        int min=a[0]; for(int i:a) if(i<min) min=i; return min;
    }
    public static int tallest(int[] a) {
        int max=a[0]; for(int i:a) if(i>max) max=i; return max;
    }
    public static void main(String[] args) {
        Random r=new Random();
        int[] h=new int[11];
        for(int i=0;i<11;i++) h[i]=150+r.nextInt(101);
        System.out.println("Mean: "+mean(h));
        System.out.println("Shortest: "+shortest(h));
        System.out.println("Tallest: "+tallest(h));
    }
}


