package javaProgramme;

class myException extends Exception {
	public myException(String str) {
		super(str);
	}
}

public class MyCustomTutorial {

	public static final String Detail_Of_Logged_User = "I am Piyush";

	public static void main(String[] args) throws myException {

		try {
			if (Detail_Of_Logged_User.contains("Piyush")) {
				throw new myException("caught Piyush..........");
			}
		} catch (myException e) {
			System.out.println(e.getMessage());
		}

	}

}
