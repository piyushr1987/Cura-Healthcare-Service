package javaProgramme;

public class AlphabetPattern {

	public static void main(String[] args) {

		int i, j, row = 5;
		char ch = 'A';

		for (i = 0; i < row; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}

	}
}
