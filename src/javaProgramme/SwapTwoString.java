package javaProgramme;

public class SwapTwoString {

	public static void main(String[] args) {

		String a = "java";
		String b = "selenium";

		System.out.println("Before swapping : " + a + " " + b);

		a = a + b; //12
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("After swapping : " + a + " " + b);

	}

}
