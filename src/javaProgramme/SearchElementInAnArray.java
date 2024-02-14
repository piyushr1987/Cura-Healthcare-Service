package javaProgramme;

public class SearchElementInAnArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 60 };
		int search_ele = 30;
		boolean flag = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == search_ele) {
				System.out.println("found serach element : " + search_ele);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("element is not found");

		}

	}
}
