package javaProgramme;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {

		int a[] = { 20, 10, 80, 45, 22, 18, 90, 5 };
		System.out.println("Before sorting : " + Arrays.toString(a));

		for (int i = 0; i <= a.length - 1; i++) {

			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		System.out.println("After sorting : " + Arrays.toString(a));

	}
}
