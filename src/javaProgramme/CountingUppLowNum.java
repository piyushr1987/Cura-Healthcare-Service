package javaProgramme;

public class CountingUppLowNum {

	public static void main(String[] args) {

		String str = "PIYabc123n4Y5M";
		int upp, low, num;
		upp = low = num = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				low++;
			} else if (ch >= 'A' && ch <= 'Z') {
				upp++;
			} else {
				num++;
			}
		}
		System.out.println("No of lower case charcater is : " + low);
		System.out.println("No of upper  case charcater is : " + upp);
		System.out.println("No of digit is : " + num);

	}

}
