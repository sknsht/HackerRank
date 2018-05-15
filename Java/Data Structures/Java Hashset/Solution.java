import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] pair_left = new String[n];
        String[] pair_right = new String[n];

        for (int i = 0; i < n; i++) {
            pair_left[i] = sc.next();
            pair_right[i] = sc.next();
        }
        HashSet<String> pairs = new HashSet<>(n);

        for (int i = 0; i < n; i++) {
            pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")");
            System.out.println(pairs.size());
        }
    }
}