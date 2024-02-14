package javaProgramme;

import java.util.Arrays;

public class SortingElementInAnArray {

	public static void main(String[] args) {
		int a[] = { 100, 500, 300, 900, 50, 200 };

		System.out.println("before sorting.....");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		for (int x : a) {
			System.out.println(x);
		}

	}

}
