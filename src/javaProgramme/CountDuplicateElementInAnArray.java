package javaProgramme;

public class CountDuplicateElementInAnArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 20, 20, 20 };
		int dup_num = 20;
		int count = 0;

		for (int x : a) {
			if (x == dup_num) {
				count++;
			}
		}
		System.out.println("Total no of duplicate element is : " + count);

	}

}
