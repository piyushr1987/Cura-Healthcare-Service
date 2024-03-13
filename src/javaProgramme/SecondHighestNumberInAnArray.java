package javaProgramme;

public class SecondHighestNumberInAnArray {

	public static void main(String[] args) {

		int a[] = { 5, 13, 41, 88, 99, 77 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);

		}
		System.out.print("The second largest number: "+a[a.length-2]);
	}

}
