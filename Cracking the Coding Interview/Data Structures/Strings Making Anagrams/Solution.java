import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        in.close();

        HashMap<Character, Integer> map = new HashMap<>();
        int difference = 0;

        for (char letter : a.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        for (char letter : b.toCharArray()) {
            if (!map.containsKey(letter) || map.get(letter) == 0)
                difference++;
            else
                map.put(letter, map.get(letter) - 1);
        }

        for (char letter : map.keySet()) {
            difference += map.get(letter);
        }
        System.out.println(difference);
    }
}
