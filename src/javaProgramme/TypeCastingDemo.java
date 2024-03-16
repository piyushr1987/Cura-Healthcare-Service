package javaProgramme;

public class TypeCastingDemo {

	// upcasting-converting value from smaller to higher
	// int--->long
	// float--> double

	// downcasting-converting value from higher to smaller
	// long-->int

	public static void main(String[] args) {

		// upcasting is automatic process
		int intvalue = 100;
		long longvalue = intvalue;
		System.out.println(longvalue);
		
		// downcasting is manual process
		long longvalue1=10000000;
		int intvalue1=(int) longvalue1;
		System.out.println(intvalue1);
		

	}

}
