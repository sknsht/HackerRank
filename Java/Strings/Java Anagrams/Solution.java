import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char letter : a.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        for (char letter : b.toCharArray()) {
            if (!map.containsKey(letter) || map.get(letter) == 0)
                return false;
            else
                map.put(letter, map.get(letter) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}