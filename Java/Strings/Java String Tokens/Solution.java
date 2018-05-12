import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim();
        scan.close();

        String[] tokens = str.split("[^\\p{Alpha}]+");

        int length = (str.isEmpty()) ? 0 : tokens.length;
        System.out.println(length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}