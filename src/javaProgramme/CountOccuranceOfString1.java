package javaProgramme;

public class CountOccuranceOfString1 {

	public static void main(String[] args) {
		String str = "piyushramtekepiyushramteke";
		int count = str.length() - str.replace("pi", "").length();
		System.out.println("no of occurance of pi is " + count);
	}

}
