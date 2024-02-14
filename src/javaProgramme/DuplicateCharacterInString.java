package javaProgramme;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(String[] args) {

		String str = "aabbcccdfht";
		char[] ch = str.toCharArray();
		Map<Character, Integer> mapData = new HashMap<Character, Integer>();

		for (char c : ch) {
			if (mapData.containsKey(c)) {
				mapData.put(c, mapData.get(c) + 1);
			} else {
				mapData.put(c, 1);
			}
		}
		Set<Character> setData = mapData.keySet();
		for (char cha : setData) {
			if (mapData.get(cha) > 1) {
				System.out.println(cha + " : " + mapData.get(cha));
			}
		}

	}

}
