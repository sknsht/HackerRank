import java.util.*;

public class Solution {

    public static void whatFlavors(int[] costs, int money) {
        HashMap<Integer, Integer> iceCreams = new HashMap<>();
        for (int i = 0; i < costs.length; i++) {
            int cost = costs[i];
            int otherCost = money - cost;

            if (iceCreams.containsKey(otherCost)) {
                System.out.println(iceCreams.get(otherCost) + " " + (i + 1));
            }
            iceCreams.putIfAbsent(cost, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int trips = in.nextInt();
        while (trips-- > 0) {
            int money = in.nextInt();
            int numFlavors = in.nextInt();
            int costs[] = new int[numFlavors];
            for (int i = 0; i < numFlavors; i++) {
                costs[i] = in.nextInt();
            }
            whatFlavors(costs, money);
        }
    }
}