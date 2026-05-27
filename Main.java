import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to AUTOCOMPLETE Search Engine made by \"Jaivardhan Malhotra\"");
        Scanner sc = new Scanner(System.in);
        Trie engine = new Trie();
        ArrayList<String> recentSearches = new ArrayList<>();
        int a = 0;
        while (a != 5) {
            System.out.println("Menu:");
            System.out.println("1. Insert Word");
            System.out.println("2. Search Prefix");
            System.out.println("3. Show Suggestions");
            System.out.println("4. Show Recent Searches");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");
            a = sc.nextInt();
            String word;
            switch (a) {
                case 1:
                    System.out.println("Enter the word you want to enter in the engine: ");
                    sc.nextLine();
                    word = sc.nextLine();
                    engine.insert(word);
                    break;

                case 2:
                    System.out.println("Enter the prefix you want to search: ");
                    sc.nextLine();
                    word = sc.nextLine();
                    TrieNode node = engine.prefixSearch(word);
                    if (node == null)
                        System.out.println("Prefix not found in engine.");
                    else
                        System.out.println("Prefix found in engine.");
                    break;

                case 3:
                    System.out.println("Enter the prefix to get suggestions: ");
                    sc.nextLine();
                    word = sc.nextLine();

                    ArrayList<Suggestion> suggestions = engine.getSuggestions(word);

                    if (suggestions.size() == 0) {
                        System.out.println("No suggestions found.");
                    } else {
                        System.out.println("Suggestions:");

                        for (Suggestion s : suggestions) {
                            System.out.println(s.word + " " + s.frequency);
                        }

                        System.out.println("Enter the word you selected/searched: ");
                        String selectedWord = sc.nextLine();

                        engine.increaseFrequency(selectedWord);
                        recentSearches.add(selectedWord);
                    }
                    break;

                case 4:
                    for(String word2 : recentSearches)
                        System.out.println(word2);  
                    break;  
                case 5:
                    System.out.println("Thank you for using the AUTOCOMPLETE Search Engine.");
                    break;
                default:
                    System.out.println("Please choose from (1-5).");
            }
        }
    }
}