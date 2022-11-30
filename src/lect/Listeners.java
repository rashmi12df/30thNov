package lect;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseClass implements ITestListener {
	
	public void OnTestStart(ITestResult result) {
		System.out.println(result.getName()+"Test has started");
	}
	
	 public void OnTestSuccess(ITestResult result) {
		 System.out.println(result.getName()+"Test has successed");
	} 
	 
	 public void OnTestFail(ITestResult result) {
		try {
			screenshot.picture(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
