package javaProgramme;

import java.util.Arrays;

public class ArrayMerge {

	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50 };
		int arr2[] = { 9, 70, 18, 23, 100 };

		int newArray[] = new int[arr1.length + arr2.length];

		System.arraycopy(arr1, 0, newArray, 0, arr1.length);
		System.arraycopy(arr2, 0, newArray, arr1.length, arr2.length);

		Arrays.sort(newArray);

		System.out.println(Arrays.toString(newArray));

	}

}
