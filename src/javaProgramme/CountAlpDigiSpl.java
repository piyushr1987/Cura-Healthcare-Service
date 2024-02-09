package javaProgramme;

public class CountAlpDigiSpl {

	public static void main(String[] args) {
		String str = "Ja@#va2020!world2";
		int alph, digi, spl;
		alph = digi = spl = 0;

		for (int i = 0; i < str.length(); i++) {
		   char	ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				alph++;

			}

			else if (ch >= '0' && ch <= '9') {
				digi++;

			} else {
				spl++;

			}

		}
		System.out.println("No of alphabets is : " + alph);
		System.out.println("No of digits is : " + digi);
		System.out.println("No of special character is : " + spl);

	}
}
