import java.util.*;

public class Solution {

    public static boolean isBalanced(String str) {
        // Must be even
        if ((str.length() & 1) == 1)
            return false;
        else {
            char[] brackets = str.toCharArray();
            Stack<Character> s = new Stack<>();
            for (char bracket : brackets)
                switch (bracket) {
                    case '{': s.push('}'); break;
                    case '(': s.push(')'); break;
                    case '[': s.push(']'); break;
                    default:
                        if (s.empty() || bracket != s.peek())
                            return false;
                        s.pop();
                }
            return s.empty();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}