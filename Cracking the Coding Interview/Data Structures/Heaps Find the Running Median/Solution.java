import java.util.*;

public class Solution {

    public static double median(List<Integer> list) {
        if ((list.size() & 1) == 1) {
            return list.get(list.size() / 2);
        } else {
            int midSize = list.size() / 2;
            return (list.get(midSize - 1) + list.get(midSize)) / 2.0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int pos = Collections.binarySearch(list, a);
            if (pos < 0) {
                pos = Math.abs(pos) - 1;
            }
            list.add(pos, a);
            System.out.println(median(list));
        }
    }
}