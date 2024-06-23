
public class Main {
    public static void main(String[] args) {
        WordDictionary wd = new WordDictionary();
        wd.addWord("apple");
        wd.addWord("banana");
        wd.addWord("avocado");
        wd.addWord("grape");
        wd.addWord("orange");
        wd.addWord("kiwi");

        System.out.println("all words ");
        wd.printAll();

        System.out.println("\nWords starting with 'A':");
        wd.printWordsOfLetter('A');

        System.out.println("\nWords starting with 'G':");
        wd.printWordsOfLetter('G');
        System.out.println("\nWords starting with '3':");
        wd.printWordsOfLetter('3');

    }
}