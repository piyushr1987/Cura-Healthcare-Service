package javaProgramme;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacterInString {

	public static void main(String[] args) {
		String str = "aaabbtttpppp";
		char[] c = str.toCharArray();

		Map<Character, Integer> mapData = new LinkedHashMap<Character, Integer>();
		for (char ch : c) {
			if (mapData.containsKey(ch)) {
				mapData.put(ch, mapData.get(ch) + 1);
			} else {
				mapData.put(ch, 1);
			}
		}
		System.out.println(mapData);

	}

}
