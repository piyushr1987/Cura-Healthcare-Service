package javaProgramme;

public class AbstractClassDemo2 extends AbstractClassDemo {

	public static void main(String[] args) {
		AbstractClassDemo2 demo2 = new AbstractClassDemo2();
		demo2.method1();
		demo2.method2();
		demo2.method3();

	}

	@Override
	public void method1() {
		System.out.println("I am in method 1");

	}

	public void method3() {
		System.out.println("I am in method 3 ");

	}

}
