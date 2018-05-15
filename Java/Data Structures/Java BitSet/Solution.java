import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet[] bits = {new BitSet(n), new BitSet(n)};

        for (int i = 0; i < m; i++) {
            String operation = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            switch (operation) {
                case "AND":
                    bits[x - 1].and(bits[y - 1]);
                    break;
                case "OR":
                    bits[x - 1].or(bits[y - 1]);
                    break;
                case "XOR":
                    bits[x - 1].xor(bits[y - 1]);
                    break;
                case "FLIP":
                    bits[x - 1].flip(y);
                    break;
                case "SET":
                    bits[x - 1].set(y);
                    break;
                default:
                    break;
            }
            System.out.println(bits[0].cardinality() + " " + bits[1].cardinality());
        }
    }
}