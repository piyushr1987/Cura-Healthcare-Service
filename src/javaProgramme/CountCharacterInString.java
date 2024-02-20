package javaProgramme;

public class CountCharacterInString {

	public static void main(String[] args) {

		String str = "aaaabbbcccddddeeefff";
		int totalCount = str.length();

		int totalCount_afterRemoving = str.replace("a", "").length();

		int count = totalCount - totalCount_afterRemoving;
		System.out.println("Number of occurance of a is : " + count);

	}

}
