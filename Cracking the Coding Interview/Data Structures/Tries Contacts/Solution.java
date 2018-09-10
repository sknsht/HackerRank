import java.util.*;

class TrieNode {
    public int size = 0;
    private HashMap<Character, TrieNode> children = new HashMap<>();

    public void putChildIfAbsent(char ch) {
        children.putIfAbsent(ch, new TrieNode());
    }

    public TrieNode getChild(char ch) {
        return children.get(ch);
    }
}

class Trie {
    TrieNode root = new TrieNode();

    Trie() {}

    public void add(String str) {
        TrieNode curr = root;

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            curr.putChildIfAbsent(ch);
            curr = curr.getChild(ch);
            curr.size++;
        }
    }

    public int find(String prefix) {
        TrieNode curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            Character ch = prefix.charAt(i);
            curr = curr.getChild(ch);
            if (curr == null) return 0;
        }
        return curr.size;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Trie trie = new Trie();
        for (int i = 0; i < n; i++) {
            String operation = in.next();
            String contact = in.next();
            if (operation.equals("add")) {
                trie.add(contact);
            } else if (operation.equals("find")) {
                System.out.println(trie.find(contact));
            }
        }
        in.close();
    }
}
