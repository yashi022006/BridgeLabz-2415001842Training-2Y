import java.util.*;

public class Friends {
    public static int youngest(int[] ages) {
        int idx = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < ages[idx]) idx = i;
        return idx;
    }
    public static int tallest(int[] heights) {
        int idx = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > heights[idx]) idx = i;
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) ages[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) heights[i] = sc.nextInt();
        System.out.println(youngest(ages));
        System.out.println(tallest(heights));
        sc.close();
    }
}

