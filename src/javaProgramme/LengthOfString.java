package javaProgramme;

public class LengthOfString {

	public static void main(String[] args) {
		String str = "piyush";
		int count = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			str.charAt(i);
			count++;
		}
		System.out.println("Total lenght of given string is : " + count);

	}

}
