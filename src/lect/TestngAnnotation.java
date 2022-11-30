package lect;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotation {

	@BeforeClass
	public void beforeclass() {
		System.out.println("Method to execute before class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before each method");
	}

	@Test(timeOut=1000)
	public void test() throws InterruptedException {
		Thread.sleep(2000);
	System.out.println("This is first method");	
	}
	
	@Test(dependsOnMethods="test")
	public void test1() {
	System.out.println("This is second method");
	}
	
	@Test(invocationCount=2)
	public void abc() {
	System.out.println("This is method");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("After each method");
		}
	
	@AfterClass
	public void afterclass() {
		System.out.println("Method to execute after class");
	}
	
}
