package javaProgramme;

public class C1 extends C2 implements I1, I2 {

	@Override
	public void m2() {
		System.out.println("I am m2 method of interface 2");

	}

	@Override
	public void m1() {

		System.out.println("I am m1 method of interface 1");
	}

	public static void main(String[] args) {

		C1 c = new C1();
		c.m1();
		c.m2();
		System.out.println(x);
		System.out.println(y);
		c.m3();

	}

}
