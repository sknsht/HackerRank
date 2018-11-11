import java.io.*;
import java.util.*;

public class Solution {

    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, ArrayList<Integer> c) {
        int minCost = 0;
        int numPurchased = 0;

        Collections.sort(c, Collections.reverseOrder());

        for (int i = 0; i < c.size(); i++) {
            if (i % k == 0) numPurchased++;
            minCost += numPurchased * c.get(i);
        }
        return minCost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        ArrayList<Integer> c = new ArrayList();

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c.add(cItem);
        }

        int minimumCost = getMinimumCost(k, c);

        bufferedWriter.write(String.valueOf(minimumCost));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
