package javaProgramme;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int c = 0;
		int temp = num;

		while (num > 0) {
			int a = num % 10;
			num = num / 10;
			c = c + (a * a * a);
		}

		if (c == temp) {
			System.out.println(c + " is a armstrong number");
		} else {
			System.out.println(c + " is not a armstrong number");
		}

	}

}
