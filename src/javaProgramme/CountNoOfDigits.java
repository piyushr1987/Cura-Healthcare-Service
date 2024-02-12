package javaProgramme;

public class CountNoOfDigits {

	public static void main(String[] args) {

		int num = 123456;
		int count = 0;

		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Total no of digits is a number is : " + count);

	}

}
