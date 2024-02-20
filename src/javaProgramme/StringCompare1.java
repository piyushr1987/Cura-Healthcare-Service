package javaProgramme;

public class StringCompare1 {

	public static void main(String[] args) {

		String s1 = new String("welcome");
		String s2 = new String("welcome");

		System.out.println(s1 == s2); //compare the object
		System.out.println(s1.equals(s2)); //compare the values of the object

	}

}
