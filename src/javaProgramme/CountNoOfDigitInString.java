package javaProgramme;

public class CountNoOfDigitInString {

	public static void main(String[] args) {
		String str = "java1122";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				count++;
			}
		}
		System.out.println("Total no of digits in given string is : " + count);

	}

}
