import java.io.*;
import java.util.*;

public class Solution {
    
    static long candies(int n, int[] marks) {
        int[] candies = new int[n];
        candies[0] = 1;

        for (int i = 1; i < n; i++) {
            candies[i] = 1;
            if (marks[i] > marks[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if (marks[i] < marks[i - 1]) {
                candies[i - 1] = Math.max(candies[i - 1], candies[i] + 1);
            }
        }
        return Arrays.stream(candies).asLongStream().sum();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
