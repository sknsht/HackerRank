import java.util.*;

public class Solution {

    public static int lonelyInteger(int[] array) {
        int result = 0;
        for (int i : array) {
            result = result ^ i; // XOR operator
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
