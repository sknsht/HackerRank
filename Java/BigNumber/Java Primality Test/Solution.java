import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        sc.close();
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}