package eksempelTimen;

import java.util.Arrays;

public class SortWords {
    public static String sortString(String inputWord){
        char[] tempArray = inputWord.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }
}
