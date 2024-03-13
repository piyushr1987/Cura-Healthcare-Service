package javaProgramme;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountWordsInString1 {

	public static void main(String[] args) {
		String str = "this is java selenium is this java";
		String words[] = str.split(" ");

		Map<String, Integer> mapData = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			if (mapData.containsKey(words[i])) {
				mapData.put(words[i], mapData.get(words[i]) + 1);
			} else {
				mapData.put(words[i], 1);
			}
		}
		System.out.println(mapData);

	}

}
