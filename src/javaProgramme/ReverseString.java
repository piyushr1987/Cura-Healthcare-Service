package javaProgramme;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Piyush";
		int len = str.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("original string : " + str);
		System.out.println("Reverse string : " + rev);
	}

}
