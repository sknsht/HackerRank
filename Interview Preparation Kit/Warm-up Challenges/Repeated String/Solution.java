import java.io.*;
import java.util.*;

public class Solution {

    static long repeatedString(String s, long n) {
        long numOccurrences = s.replaceAll("[^a]", "").length();
        if (numOccurrences == 0)
            return numOccurrences;

        long remainder = n % s.length();
        long numRepetitions = n / s.length();
        numOccurrences = numRepetitions * numOccurrences;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                numOccurrences++;
            }
        }
        return numOccurrences;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
