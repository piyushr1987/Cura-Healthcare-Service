package javaProgramme;

class Parent {
	String name = "Piyush";

	public void m1() {
		System.out.println("This is m1 method of parent class.......");
	}
}

class Child extends Parent {
	int id = 101;

	public void m2() {
		System.out.println("This is m2 method of child class.......");
	}
}

public class TypeCastingDemoForObject {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.name); // parent
		c.m1();// parent
		System.out.println(c.id);// child
		c.m2();// child

		Parent p = new Child();// upcasting
		System.out.println(p.name);// parent
		p.m1();// parent
		
		//downcasting
		Parent pa=new Parent();
		Child ch=(Child) pa;
		System.out.println(ch.name); // parent
		ch.m1();// parent
		System.out.println(ch.id);// child
		ch.m2();// child
	}

}
