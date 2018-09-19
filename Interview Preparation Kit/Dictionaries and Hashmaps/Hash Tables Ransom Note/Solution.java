import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        
        HashMap<String, Integer> magazine = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String word = in.next();
            magazine.put(word, magazine.getOrDefault(word, 0) + 1);
        }
        HashMap<String, Integer> ransom = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = in.next();
            ransom.put(word, ransom.getOrDefault(word, 0) + 1);
        }
        in.close();
        
        if (magazine.size() < ransom.size()) {
            System.out.println("No");
        } else {
            Optional<Integer> res = ransom.entrySet().stream()
                    .map(e -> magazine.getOrDefault(e.getKey(), 0) - e.getValue())
                    .filter(e -> e < 0)
                    .findFirst();
            System.out.println(res.isPresent() ? "No" : "Yes");
        }
    }
}