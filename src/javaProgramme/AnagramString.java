package javaProgramme;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str1 = "brag";
		String str2 = "grawb";

		if (str1.length() != str2.length()) {
			System.out.println("Both are not anagram");
		} else {
			char[] srting1 = str1.toCharArray();
			char[] srting2 = str2.toCharArray();
			Arrays.sort(srting1);
			Arrays.sort(srting2);

			if (Arrays.equals(srting1, srting2) == true) {
				System.out.println("Both are anagram");
			} else {
				System.out.println("Both are not anagram");
			}
		}

	}

}
