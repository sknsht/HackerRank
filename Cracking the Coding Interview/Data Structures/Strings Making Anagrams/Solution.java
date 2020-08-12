import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        Map<Integer, Integer> map = new HashMap<>();
        a.chars().forEach(c -> map.put(c, map.getOrDefault(c, 0) + 1));
        b.chars().forEach(c -> map.put(c, map.getOrDefault(c, 0) - 1));
        return map.values().stream().reduce(0, (subtotal, value) -> subtotal + Math.abs(value));
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
