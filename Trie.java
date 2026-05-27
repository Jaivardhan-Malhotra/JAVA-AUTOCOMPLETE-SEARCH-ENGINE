import java.util.ArrayList;
import java.util.Collections;

public class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode curr = root;
        int idx = 0;
        for (int i = 0; i < word.length(); i++) {
            idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                TrieNode node = new TrieNode();
                curr.children[idx] = node;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public TrieNode prefixSearch(String word) {
        TrieNode curr = root;
        int idx = 0;
        for (int i = 0; i < word.length(); i++) {
            idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return null;
            }
            curr = curr.children[idx];
        }
        return curr;
    }

    public void helper(TrieNode curr, String word, ArrayList<Suggestion> result) {
        if (curr.eow == true)
            result.add(new Suggestion(word, curr.frequency));
        for (int i = 0; i < 26; i++) {
            if (curr.children[i] != null) {
                char ch = (char) (i + 'a');
                helper(curr.children[i], word + ch, result);
            }
        }
        return;
    }

    public ArrayList<Suggestion> getSuggestions(String prefix) {
        ArrayList<Suggestion> result = new ArrayList<>();
        TrieNode curr = prefixSearch(prefix);
        if (curr == null)
            return result;
        helper(curr, prefix, result);
        Collections.sort(result, (a, b) -> b.frequency - a.frequency);
        return result;
    }

    public void increaseFrequency(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null)
                return;

            curr = curr.children[idx];
        }

        if (curr.eow == true)
            curr.frequency++;
    }
}