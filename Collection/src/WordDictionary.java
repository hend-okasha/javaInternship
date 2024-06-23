import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class WordDictionary {
    private Map< Character, List<String>> wordMap;
    public WordDictionary(){
        wordMap = new HashMap<>();
        for (char ch ='A'; ch<= 'Z' ;ch++){
            wordMap.put(ch, new ArrayList<>());
        }
    }

    public void addWord(String str){
        if (str == null || str.isEmpty()){
            return;
        }
        char firstCharacter = Character.toUpperCase(str.charAt(0));
        List<String> words = wordMap.get(firstCharacter);
        if ( str != null){
            words.add(str);
        }else {
            System.out.println( str+" is invalid word");
        }
}
    public void printAll(){
        for (Map.Entry<Character, List<String>> entry : wordMap.entrySet()){
            char letter =entry.getKey();
            List<String> words = entry.getValue();
            System.out.println(letter + "+"+ words);
        }
    }

    public void printWordsOfLetter(char letter){
        letter= Character.toUpperCase(letter);
        List<String> words= wordMap.get(letter);
        if ( words != null){
            System.out.println("words of letter "+ letter+ "is : "+ words);
        }else {
            System.out.println("No words found for this letter");
        }
    }


}
