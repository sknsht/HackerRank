import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int numContests = scanner.nextInt();
        int maxLoses = scanner.nextInt();

        int maxLuck = 0;

        List<Integer> importantContests = new ArrayList<>();

        for (int i = 0; i < numContests; i++) {
            int luck = scanner.nextInt();
            int importance = scanner.nextInt();
            maxLuck += luck;

            if (importance == 1)
                importantContests.add(luck);
        }
        scanner.close();

        Collections.sort(importantContests);
        for (int i = 0; i < importantContests.size() - maxLoses; i++) {
            maxLuck -= 2 * importantContests.get(i);
        }

        System.out.println(maxLuck);
    }
}
