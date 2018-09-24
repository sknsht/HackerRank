import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static long countInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static long mergeSort(int[] a, int start, int end) {
        if (start == end)
            return 0;

        int mid = (start + end) / 2;
        long inversions = mergeSort(a, start, mid) +
                          mergeSort(a, mid + 1, end) +
                          merge(a, start, end);
        return inversions;
    }

    public static long merge(int[] a, int start, int end) {
        int[] tmp = new int[end - start + 1];
        long inversions = 0;

        int mid = (start + end) / 2;

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (a[i] > a[j]) {
                tmp[k++] = a[j++];
                inversions += mid - i + 1;
            } else {
                tmp[k++] = a[i++];
            }
        }

        while (i <= mid) {
            tmp[k++] = a[i++];
        }

        while (j <= end) {
            tmp[k++] = a[j++];
        }

        System.arraycopy(tmp, 0, a, start, end - start + 1);
        return inversions;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
            }
            System.out.println(countInversions(a));
        }
    }
}