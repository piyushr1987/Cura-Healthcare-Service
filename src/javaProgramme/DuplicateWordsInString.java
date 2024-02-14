package javaProgramme;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		String s = "Hey java is java best language is java";
		String[] words = s.split(" ");

		Map<String, Integer> mapData = new HashMap<String, Integer>();
		for (String word : words) {
			if (mapData.containsKey(word)) {
				mapData.put(word, mapData.get(word) + 1);
			} else {
				mapData.put(word, 1);
			}
		}
		System.out.println(mapData);
		Set<String> setData = mapData.keySet();
		for (String wo : setData) {
			if (mapData.get(wo) > 1) {
				System.out.println(wo + " : " + mapData.get(wo));
			}
		}

	}

}
