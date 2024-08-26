package testing;

import eksempelTimen.AnagramFinder;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Anagram_test {
    @Test
    void angagramHasThreeMatches(){
        var wordList = List.of("meat", "team", "mate","pizza");
        Map<String, List<String>> result = AnagramFinder.anagramFinder(wordList);

        assertEquals(result.get("aemt").size(), 3);



    }
}
