package javaProgramme;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 123;
		int rev = 0;

		while (num > 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		System.out.println("Reverse number is : " + rev);

	}

}
