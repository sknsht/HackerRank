import java.io.*;
import java.util.*;

public class Solution {

    // Complete the isBalanced function below.
    static boolean isBalanced(String str) {
        // Must be even
        if ((str.length() & 1) == 1)
            return false;
        else {
            char[] brackets = str.toCharArray();
            Stack<Character> s = new Stack<>();
            for (char bracket : brackets)
                switch (bracket) {
                    case '{': s.push('}'); break;
                    case '(': s.push(')'); break;
                    case '[': s.push(']'); break;
                    default:
                        if (s.empty() || bracket != s.peek())
                            return false;
                        s.pop();
                }
            return s.empty();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String str = scanner.nextLine();

            String result = isBalanced(str) ? "YES" : "NO";

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
