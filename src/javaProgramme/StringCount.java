package javaProgramme;

public class StringCount {

	public static void main(String[] args) {

		String name = "piyushramtekepiyushramteke";
		String findStr = "pi";
		int lastIndex = 0;
		int count = 0;

		while (lastIndex != -1) {

			lastIndex = name.indexOf(findStr, lastIndex);

			if (lastIndex != -1) {
				count++;
				lastIndex += findStr.length();
			}
		}
		System.out.println(count);

	}

}
