import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                row.add(in.nextInt());
            }
            rows.add(row);
        }
        
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            try {
                System.out.println(rows.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}