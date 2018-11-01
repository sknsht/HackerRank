import java.io.*;
import java.util.*;

public class Solution {

    static int countingValleys(String path) {
        int level = 0;
        int numValleys = 0;
        for (char direction : path.toCharArray()) {
            switch (direction) {
                case 'D':
                    if (level-- == 0) numValleys++;
                    break;
                case 'U':
                    level++;
                    break;
            }
        }
        return numValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
