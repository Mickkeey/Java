//Given a list of words, write a Java function to find all pairs of words that are anagrams of each other.
package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AnagramPairs {
    public static List<List<String>> findAnagramPairs(List<String> words) 
    {    	
        List<List<String>> anagramPairs = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
    	for (String s : words)
    	{
    		
            char[] sortedWord = s.toCharArray();
            Arrays.sort(sortedWord);
        			
            
            String sortedKey = new String(sortedWord);
            
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
        		}
            map.get(sortedKey).add(s);
        	}
        	    	
    	for (List<String> anagramList : map.values()) {
            if (anagramList.size() >= 2) {
                anagramPairs.add(anagramList);
            }
        }
        
        return anagramPairs;
}
    
    
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("listen", "silent", "act", "cat", "hello", "world", "tea", "eat", "mohit","homsti");
        List<List<String>> anagramPairs = findAnagramPairs(wordList);
        
        System.out.println("Anagram pairs:");
        for (List<String> pair : anagramPairs) {
            System.out.println(pair.get(0) + ", " + pair.get(1));
        }
    }
}

//
//O/p:
//Anagram pairs:
//listen, silent
//act, cat
//tea, eat

