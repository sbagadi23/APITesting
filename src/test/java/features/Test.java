package features;

import java.util.Map;
import java.util.LinkedHashMap;

//find a repeating word in a paragraph and count the number of times it is repeated and print the word and the count if it is more than 1

public class Test {
		
	public static void main(String[] args) {
		String paragraph = "This is a test paragraph. this This paragraph is important for testing. Testing is important.";
		String[] words = paragraph.split("\\W+"); // Split on non-word characters
		
		// Use a LinkedHashMap to count words case-insensitively and preserve insertion order
		Map<String, Integer> counts = new LinkedHashMap<>();
		for (String w : words) {
			if (w == null || w.length() == 0) {
				continue;
			}
			String key = w.toLowerCase();
			System.out.println("Processing word: "+counts.getOrDefault(key, 0) );
			counts.put(key, counts.getOrDefault(key, 0) + 1);
		}
		
		// Print each word that appears more than once (only once per word)
		for (Map.Entry<String, Integer> e : counts.entrySet()) {
			if (e.getValue() > 1) {
				System.out.println("Word: '" + e.getKey() + "' Count: " + e.getValue());
			}
		}
	}
	
}