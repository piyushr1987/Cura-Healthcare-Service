package javaProgramme;

public class PrintNumbersDivByTen {

	public static void main(String[] args) {
		int num = 1000;

		for (int i = 1; i <= num; i++) {
			if (num % 10 == 0) {
				System.out.println(i);

			}
		}

	}

}
