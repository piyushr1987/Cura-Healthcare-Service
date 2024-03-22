package seleniumScript;

import org.testng.annotations.*;

public class TestNGDemo {

	@BeforeSuite
	public void m1() {
		System.out.println("I am in before suit");
	}

	@AfterSuite
	public void m2() {
		System.out.println("I am in after suit");
	}

	@BeforeTest
	public void m3() {
		System.out.println("I am in before test");
	}

	@AfterTest
	public void m4() {
		System.out.println("I am in after test");
	}

	@Test(priority = 1)
	public void TC1() {
		System.out.println("I am in Test Case 1");
	}

	@Test(priority = 3)
	public void TC2() {
		System.out.println("I am in Test Case 2");
	}

	@Test(priority = 2)
	public void TC3() {
		System.out.println("I am in Test Case 3");
	}

	@BeforeClass
	public void m5() {
		System.out.println("I am in before class");
	}

	@BeforeMethod
	public void m6() {
		System.out.println("I am in before method");
	}

	@AfterMethod
	public void m7() {
		System.out.println("I am in after method");
	}

	@AfterClass
	public void m8() {
		System.out.println("I am in after class");
	}

}
