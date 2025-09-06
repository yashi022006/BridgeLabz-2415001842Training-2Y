import java.util.*;

public class smallestLargest {
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int[] sl = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest: " + sl[0] + " Largest: " + sl[1]);
        sc.close();
    }
}

