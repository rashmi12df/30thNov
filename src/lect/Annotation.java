package lect;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeClass
	public void beforeclass() {
		System.out.println("Method to execute before class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before each method");
	}

	@Test
	@Parameters({"i","j"})
	public void test(int a,int b) {
	System.out.println(a+b);	
	}
	
	@Test
	public void test1() {
	System.out.println("Hi!!How are you?");
	}
	
	@Test
	public void abc() {
	System.out.println("Let me Introduce myself!!");
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
