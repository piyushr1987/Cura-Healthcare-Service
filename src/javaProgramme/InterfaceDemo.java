package javaProgramme;

interface Shape {

	void circle();

	default void rectangle() {
		System.out.println("I am rectangle shape...");
	}

	static void square()

	{
		System.out.println("I am square shape...");
	}

}

public class InterfaceDemo implements Shape {

	public void circle() {

		System.out.println("I am circle shape...");
	}

	public static void main(String[] args) {

		System.out.println("**************************");
		InterfaceDemo intobj = new InterfaceDemo();
		intobj.circle();
		intobj.rectangle();
		Shape.square();

		System.out.println("#########################");

		Shape sh = new InterfaceDemo();
		sh.circle();
		sh.rectangle();
		Shape.square();
	}

}
