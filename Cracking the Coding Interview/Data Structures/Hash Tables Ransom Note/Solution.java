
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        final Map<String, Integer> map = new HashMap<>();
        Stream.of(magazine).forEach(word -> map.put(word, map.getOrDefault(word, 0) + 1));
        Stream.of(note).forEach(word -> map.put(word, map.getOrDefault(word, 0) - 1));
        final String answer = map.values().stream().anyMatch(v -> v < 0) ? "No" : "Yes";
        System.out.println(answer);
    }

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];
        String[] magazineItems = scanner.nextLine().split(" ");
        System.arraycopy(magazineItems, 0, magazine, 0, m);

        String[] note = new String[n];
        String[] noteItems = scanner.nextLine().split(" ");
        System.arraycopy(noteItems, 0, note, 0, n);

        checkMagazine(magazine, note);

        scanner.close();
    }
}
