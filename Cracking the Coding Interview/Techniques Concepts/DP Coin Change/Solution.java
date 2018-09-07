import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] coins = new int[m];
        for (int i = 0; i < m; i++) {
            coins[i] = in.nextInt();
        }
        in.close();

        System.out.println(numWays(n, coins));
    }

    public static long numWays(int n, int[] coins) {
        long[] numWays = new long[n + 1];
        numWays[0] = (long) 1;
        for (int coin : coins) {
            for (int i = coin; i < n + 1; i++) {
                numWays[i] += numWays[i - coin];
            }
        }
        return numWays[n];
    }
}
