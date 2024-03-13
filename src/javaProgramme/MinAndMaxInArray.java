package javaProgramme;

public class MinAndMaxInArray {

	public static void main(String[] args) {
		int a[] = { 20, 10, 80, 45, 22, 18, 90, 5 };
		int min_no = a[0];
		int max_no = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min_no) {
				min_no = a[i];
			}
		}
		System.out.println("minimum no is an array is : " + min_no);

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max_no) {
				max_no = a[i];
			}
		}
		System.out.println("maximum no is an array is : " + max_no);

	}

}
