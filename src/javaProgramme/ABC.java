package javaProgramme;

public class ABC implements XYZ {

	public static void main(String[] args) {

		ABC abc = new ABC();
		abc.method1();
		abc.method2();

	}

	@Override
	public void method1() {
		System.out.println("I am in method 1");

	}

	@Override
	public void method2() {
		System.out.println("I am in method 2");

	}

}
