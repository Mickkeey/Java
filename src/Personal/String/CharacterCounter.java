package Personal.String;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

    public static void main(String[] args) {
        String s = "mohitsharma";

        Map<Character, Integer> charCountMap = countCharacters(s);

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times");
        }
    }

    public static Map<Character, Integer> countCharacters(String s) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            // Update the count for the character
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }
}
