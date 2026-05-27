public class TrieNode {
    TrieNode[] children;
    boolean eow;
    int frequency;

    public TrieNode() {
        children = new TrieNode[26];
        frequency = 0;
        eow = false;
    }
}