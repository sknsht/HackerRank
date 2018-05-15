import java.util.*;

class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }

        while (in.hasNext()) {
            String name = in.nextLine();
            String result = Optional.ofNullable(phoneBook.get(name))
                    .map(phone -> name + "=" + phone).orElse("Not found");
            System.out.println(result);
        }
    }
}