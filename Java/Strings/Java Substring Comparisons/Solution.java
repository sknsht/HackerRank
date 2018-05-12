import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String str, int k) {
        SortedSet<String> sets = new TreeSet<>();
        for (int i = 0; i <= str.length() - k; i++) {
            sets.add(str.substring(i, i + k));
        }
        return sets.first() + "\n" + sets.last();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(str, k));
    }
}