package javaProgramme;

public class ChildClass extends ParentClass{
	
	public void method1() {
		System.out.println("I am in child class method 1");
	}

	public void method2() {
		System.out.println("I am in child class method 2");
	}

	public static void main(String[] args) {
		ChildClass cc = (ChildClass) new ParentClass();
		cc.method1();
		cc.method2();
		cc.method1();
		cc.method2();

	}

}
