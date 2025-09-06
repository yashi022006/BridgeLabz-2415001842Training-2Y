import java.util.Arrays;
public class NumberChecker2 {
    public static int[] digitsArray(int n) {
        String s=String.valueOf(n);
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    public static int sumDigits(int[] d) {
        int s=0; for(int x:d)s+=x; return s;
    }
    public static int sumSquares(int[] d) {
        int s=0; for(int x:d)s+=Math.pow(x,2); return s;
    }
    public static boolean isHarshad(int n) {
        int[] d=digitsArray(n);
        return n%sumDigits(d)==0;
    }
    public static int[][] frequency(int[] d) {
        int[][] f=new int[10][2];
        for(int i=0;i<10;i++)f[i][0]=i;
        for(int x:d)f[x][1]++;
        return f;
    }
    public static void main(String[] args) {
        int n=21;
        int[] d=digitsArray(n);
        System.out.println("Sum: "+sumDigits(d));
        System.out.println("Squares Sum: "+sumSquares(d));
        System.out.println("Harshad: "+isHarshad(n));
        System.out.println(Arrays.deepToString(frequency(d)));
    }
}
