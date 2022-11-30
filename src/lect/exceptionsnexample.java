package lect;

import java.util.Scanner;

public class exceptionsnexample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter value of b");
		int b=sc.nextInt();
		
		try {
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Invalid input");
		}
		finally {
			System.out.println("Error and Exception");
		}
		
		
		
	}

}
