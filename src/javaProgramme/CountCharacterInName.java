package javaProgramme;

public class CountCharacterInName {

	public static void main(String[] args) {

		String name = "piyush";
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ' ') {
				count++;
			}

		}
		System.out.println("No of character in name is : " + count);

	}
}
