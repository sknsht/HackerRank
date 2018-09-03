import java.util.*;

public class Solution {

    public static int largestRegion(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, countCells(grid, i, j));
            }
        }
        return max;
    }

    private static int countCells(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return 0;
        if (grid[i][j] == 0)
            return 0;

        int count = grid[i][j]--; //it works as a flag to stop the recursion
        count += countCells(grid, i + 1, j);
        count += countCells(grid, i - 1, j);
        count += countCells(grid, i, j + 1);
        count += countCells(grid, i, j - 1);
        count += countCells(grid, i + 1, j + 1);
        count += countCells(grid, i - 1, j - 1);
        count += countCells(grid, i - 1, j + 1);
        count += countCells(grid, i + 1, j - 1);

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        System.out.println(largestRegion(grid));
    }
}