package javaProgramme;

public class PrintIntials {

	public static void main(String[] args) {

		String name = "Piyush Prakash Ramteke";
		String word = "";

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				System.out.print(word.charAt(0) + ".");
				word="";
			}
		}
		System.out.println(word);

	}

}
