package javaProgramme;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int num = 5;
		long fact = 1;

		for (int i = num; i > 0; i--) {
			fact = fact * i;
		}
		System.out.println("factorial of given number is : " + fact);

	}

}
