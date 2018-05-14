import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[6][6];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][j] = sc.nextInt();
                if (i > 1 && j > 1) {
                    int sum = a[i][j] 
                            + a[i][j - 1] 
                            + a[i][j - 2] 
                            + a[i - 1][j - 1] 
                            + a[i - 2][j] 
                            + a[i - 2][j - 1] 
                            + a[i - 2][j - 2];

                    if (sum > max)
                        max = sum;
                }
            }
        }

        sc.close();
        System.out.println(max);
    }
}