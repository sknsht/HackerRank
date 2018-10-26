import java.util.*;

public class Solution {

    public static int numWays(int n) {
        if (n < 3) {
            return n;
        }
        if (n == 3) {
            return 4;
        }

        int[] numWays = new int[n];

        numWays[0] = 1;
        numWays[1] = 2;
        numWays[2] = 4;
        for (int i = 3; i < n; i++) {
            numWays[i] = numWays[i - 1] +
                         numWays[i - 2] +
                         numWays[i - 3];
        }
        return numWays[n - 1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (in.hasNext()) {
            int staircaseHeight = in.nextInt();
            System.out.println(numWays(staircaseHeight));
        }
    }
}
