package javaProgramme;

public class TryDemo {

	public static void main(String[] args) {

		int a;
		try {
			a = 10 / 0;
			System.out.println(a);
		}
		finally
		{
			System.out.println("I am in finally block");
		}
		

	}

}
