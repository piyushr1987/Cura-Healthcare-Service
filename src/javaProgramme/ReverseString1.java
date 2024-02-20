package javaProgramme;

public class ReverseString1 {

	public static void main(String[] args) {

		String str = "welcome";
		char[] c = str.toCharArray();
		String rev = "";

		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		System.out.println("reverse string is : " + rev);

	}

}
