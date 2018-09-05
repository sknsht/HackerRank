import java.util.*;

public class Solution {

    public static int fibonacci(int n) {
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
//        if (n < 2){
//            return n;
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2);  
//        }   
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
