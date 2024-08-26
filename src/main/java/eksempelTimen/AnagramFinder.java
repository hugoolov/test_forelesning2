package eksempelTimen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public abstract class AnagramFinder {
    public static Map<String, List<String>> anagramFinder(List<String> wordList) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String unsortedWord : wordList) {
            var sortedWord = alfabetizeWord(unsortedWord);
            if (anagrams.get(sortedWord) != null) {
                anagrams.put(sortedWord, Stream.concat(anagrams.get(sortedWord).stream(), Stream.of(unsortedWord)).toList());
            } else {
                anagrams.put(sortedWord, List.of(unsortedWord));
            }
        }
        return anagrams;
    }
    private static String alfabetizeWord(String word){
        char[] wordArray = word.toCharArray();
        Arrays.sort(wordArray);
        return new String(wordArray);
    }
}
